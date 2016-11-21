package models.employees;

import static repositories.AnimalRepository.createNode;

import java.math.*;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.XML_Parsable;

public abstract class Employees implements XML_Parsable{
	protected String name;
	protected Long id;
	protected BigDecimal salary;
	protected boolean isDead;
	protected Employees(String name, Long id, BigDecimal salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
		isDead = false;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public BigDecimal getSalary()
	{
		return salary;
	}
	public void setSalary(BigDecimal salary)
	{
		this.salary = salary;
	}
	public boolean getIsDead()
	{
		return isDead;
	}
	public void setIsDead(boolean isDead)
	{
		this.isDead = isDead;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		createNode(eventWriter,"name", String.valueOf(this.name));
		createNode(eventWriter,"id", String.valueOf(this.id));
		createNode(eventWriter,"salary", String.valueOf(this.salary));
		createNode(eventWriter,"isDead", String.valueOf(this.isDead));
	}
	public void decodeFromXML( Element element) 
	{
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setIsDead (Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
		setSalary (BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
	}
}
