package models.employees;

import static repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.animals.*;
import services.factories.Constants;

public class Caretaker extends Employees implements Caretaker_I{
	private double workingHours;
	public Caretaker(String name, BigDecimal salary, double workingHours)
	{
		super(name, Id.getId(), salary);
		this.workingHours = workingHours;
	}
	public Caretaker()
	{
		super("Unknown", Id.getId(), null);
		workingHours = 0;
	}
	public String takeCareOf(Animal animal)
	{
		if (this.workingHours < animal.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		if (animal.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		animal.setTakenCareOf(true);
		workingHours -= animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
			
	}
	public double getWorkingHours()
	{
		return workingHours;
	}
	public void setWorkingHourse(double workingHours)
	{
		this.workingHours = workingHours;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretaker);
	}
	public void decodeFromXML( Element element) 
	{
		super.decodeFromXML(element);
		setWorkingHourse(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
