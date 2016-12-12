package javasmmr.zoowsome.models;
import java.math.BigDecimal;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

/*
 * The employee class with everything it's needed
 */
public abstract class Employee implements XML_Parsable {
	
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead = false;
	
	public Employee(String aName, BigDecimal aSalary, Boolean anAnswer)
	{
		this.name = aName;
		this.salary = aSalary;
		this.isDead = anAnswer;
		this.id = this.numbGen();
	}
	
	public Long numbGen() // randomize the creation of id's
		{
		    while (true) {
		        Long numb = (long)(Math.random() * 100000000 * 1000000); 
		        if (String.valueOf(numb).length() == 13)
		            return numb;
	    }
	}
	
	public void setId(Long number)
	{
		number = this.numbGen();
		id = number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String theName)
	{
		name = theName;
	}
	
	public BigDecimal getSalary()
	{
		return salary;
	}
	
	public void setSalary(BigDecimal value)
	{
		salary = value;
	}
	
	public Boolean getIfDead()
	{
		return isDead;
	}
	
	public void setIfDead(Boolean answer)
	{
		isDead = answer;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}
	
	public void decodeFromXml(Element element)
	{
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIfDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
	}

}
