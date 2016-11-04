package models.employees;

import static repositories.EmployeeRepository.createNode;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable{
	private String name;
	protected Long id = ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
	private BigDecimal salary;
	private Boolean isDead = false;
	
	public Employee(String name , BigDecimal salary , Boolean isDead){
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
	public String getName(){
		return name;
	}
	public void setId(Long id){
		this.id = id;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public Boolean getIsDead(){
		return isDead;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public void setIsDead(Boolean isDead){
		this.isDead = isDead;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "ID", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		
	}
	public void decodeFromXml(Element element){
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setId(Long.valueOf(element.getElementsByTagName("Id").item(0).getTextContent()));
		setSalary(BigDecimal.valueOf(Long.parseLong(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
