package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowesome.models.interfaces.XML_Parsable;
import javasmmr.zoowesome.repositories.AnimalRepository;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Employee implements XML_Parsable{

	private String name;
	private long id ;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(String name,BigDecimal salary)
	{
		this.name=name;
		this.id = (long)(Math.random() * 10000000 * 1000000);
		this.salary=salary;
		this.isDead=false;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getID()
	{
		return id;
	}
	public void setID(long id)
	{
		this.id=id;
	}
	public BigDecimal getSalary()
	{
		return salary;
	}
	public void setSalary(BigDecimal salary)
	{
		this.salary=salary;
	}
	public boolean getIsDead()
	{
		return isDead;
	}
	public void setIsDead(boolean isDead)
	{
		this.isDead=isDead;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		AnimalRepository.createNode(eventWriter, "name", String.valueOf(this.name));
		AnimalRepository.createNode(eventWriter, "id", String.valueOf(this.id));
		AnimalRepository.createNode(eventWriter, "salary", String.valueOf(this.salary));
		AnimalRepository.createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}
	public void decodeFromXml(Element element)
	{
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setID(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		//setSalary(BigDecimal.valueOf(sal));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));

	}
	
}
