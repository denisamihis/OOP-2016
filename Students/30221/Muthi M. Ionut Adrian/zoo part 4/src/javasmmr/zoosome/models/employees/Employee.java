package javasmmr.zoosome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Employee  {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead=false;

	
	

	public Employee(String name, long id, BigDecimal salary, boolean isDead) {
		// TODO Auto-generated constructor stub
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		name=this.name;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	public void setSalary(BigDecimal salary){
		salary=this.salary;
	}
   
	public long getId(){
		return id;
	}
	
	public void setId(){
		Random rand=new Random();
		id=rand.nextLong();
		
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setIsDead(boolean isDead){
		
		isDead=this.isDead;
		
	}
	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("idDead").item(0).getTextContent()));
		}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		
	}


}
