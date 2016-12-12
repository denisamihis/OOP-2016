package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

public abstract class Employees implements XML_Parsable {
	private String name;
	protected Long id;
	private BigDecimal salary;
	private Boolean isDead;
	
	public Employees(String name, BigDecimal salary,Long id){
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.isDead=false;
	}
	
	public Employees(){
		this.name="Unknown";
		this.id=ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
		this.salary=BigDecimal.ZERO;
		this.isDead=false;
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setIsDead(Boolean isDead){
		this.isDead=isDead;
	}
	
	public Boolean getIsDead(){
		return isDead;
	}
	

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	 }
	

	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
	 	setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
	 	setSalary(BigDecimal.valueOf(Long.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
	 	setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
