package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Animal implements Killer, XML_Parsable {
	
	private int numberOfLegs;
	private String theName;
	protected  Double maintenanceCost; // second part
	protected  double dangerPercentage; // second part
	private boolean takenCareOf = false; // second part
	
	public Animal(Double theValue, double percValue) // added this constructor
	{
		maintenanceCost = theValue;
		dangerPercentage = percValue;
	}
	
	public void setMaintenanceCost(double value)
	{
		maintenanceCost = value;
	}
	
	public void setDangerPercentage(double value)
	{
		dangerPercentage = value;
	}
	
	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int nrOfLegs)
	{
		numberOfLegs = nrOfLegs;
	}
	
	public String getName()
	{
		return theName;
	}
	
	public void setName(String newName)
	{
		theName = newName;
	}
	
	public Double getMaintenanceCost()
	{
		return this.maintenanceCost;
	}
	
	public double getDangerPercent()
	{
		return dangerPercentage;
	}
	
	public void setTakenCareOf(boolean value)
	{
		takenCareOf = value;
	}
	
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		createNode(eventWriter, "numberOfLegs", String.valueOf(this.numberOfLegs));
		createNode(eventWriter, "theName", String.valueOf(this.theName));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPercentage", String.valueOf(this.dangerPercentage));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	
	public void decodeFromXml(Element element)
	{
		setNumberOfLegs(Integer.valueOf(element.getElementsByTagName("numberOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("theName").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPercentage(Double.valueOf(element.getElementsByTagName("dangerPercentage").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}

