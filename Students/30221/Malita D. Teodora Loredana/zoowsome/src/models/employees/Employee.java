package models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.animlas.XMLStreamExceptionMLStreamException;
import repositories.AnimalRepository;
import repositories.EmployeeRepository;

public abstract class Employee {
	protected String name;
	protected BigDecimal salary;
	protected boolean isDead;
	protected long id;
	public Employee(String name, BigDecimal salary, long id){
		this.name=name;
		this.salary=salary;
		this.id=id;
		isDead= false;
	}
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamExceptionMLStreamException, XMLStreamException {
		try {
			EmployeeRepository.createNode(eventWriter,"name",String.valueOf(this.name));
			EmployeeRepository.createNode(eventWriter,"salary",String.valueOf(this.salary));
			EmployeeRepository.createNode(eventWriter,"isDead",String.valueOf(this.isDead));
			EmployeeRepository.createNode(eventWriter,"id",String.valueOf(this.id));
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}
	public void decodeFromXml(Element element){
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setName( element.getElementsByTagName("name").item(0).getTextContent());
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
	public String getName(){
		return name;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	public long getID(){
		return id;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public boolean getIsDead()
	{
		return isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead=isDead;
		
	}
}

