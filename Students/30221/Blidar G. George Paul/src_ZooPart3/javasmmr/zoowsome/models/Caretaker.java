package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import java.math.BigDecimal;

import javasmmr.zoowsome.services.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

/**
 * The salary could have been generated randomly, but I don't think it's the case right now
 */
public class Caretaker extends Employee implements Caretaker_I {
	
	private Double workingHours;
	
	public Caretaker()
	{
		this("CARETAKER", new BigDecimal(1000), false, new Double(11*Math.random()+1));
	}
	
	public Caretaker(String name, BigDecimal aSalary, Boolean answer, Double hours)
	{
		super(name,aSalary,answer);
		this.setSalary(aSalary);
		this.setName(name);
		this.setIfDead(answer);
		this.setWorkingHours(hours);
		
	}
	
	public BigDecimal salaryGen() 
	{		
		BigDecimal theSalary = new BigDecimal(3000*Math.random()+1000);
		return theSalary;
	}
	
	public void setWorkingHours(Double value)
	{
		workingHours = value;
	}
	
	public Double getWorkingHours()
	{
		return workingHours;
	}
	
	public String takeCareOf(Animal animal)
	{
		if(animal.kill())
		{
			return Constants.Caretakers.TCO_KILLED;
		}
		else if(this.workingHours < animal.maintenanceCost)
		{
			return Constants.Caretakers.TCO_NO_TIME;
		}
		else
		{
			animal.setTakenCareOf(true);
			this.workingHours = this.workingHours - animal.maintenanceCost;
			return Constants.Caretakers.TCO_SUCCES;
		}
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"workingHours",String.valueOf(this.workingHours));
	}
	
	public void decodeFromXml(Element element)
	{
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
