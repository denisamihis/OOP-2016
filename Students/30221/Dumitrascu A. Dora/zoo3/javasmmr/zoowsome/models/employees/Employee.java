package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;
import java.util.Random;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Employee implements Caretaker_I{
	protected String name;
	Random randno=new Random();
	protected long id=randno.nextLong();
	protected BigDecimal salary;
	protected boolean isDead=false;
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		}
	
	public String getName(){
		return name;
	}
	
	public long getId(){
		return id;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setId(long id){
		this.id=id;
	}
	
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	
	public void setIsDead(boolean isDead){
		this.isDead=isDead;
	}
	
	public void decodeFromXml(Element element) {
		setName(String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()));
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
		setSalary(BigDecimal.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())); //some BigDecimal stuff -error
		}
	

}
