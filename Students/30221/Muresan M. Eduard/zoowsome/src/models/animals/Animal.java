package models.animals;

import static repositories.AnimalRepository.createNode;


import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.XML_Parsable;

public abstract class Animal implements Killer, XML_Parsable{
	protected String name;
	protected int nrOfLegs;
	protected double maintenanceCost;
	protected double dangerPerc;
	protected boolean takenCareOf;
	public Animal(String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		this.name = name;
		this.nrOfLegs = nrOfLegs;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		takenCareOf = false;
	}
	public double getPredisposition()
	{
		return 0;
	}
	public boolean kill()
	{
		Random kill = new Random();
		return kill.nextDouble() + getPredisposition() < dangerPerc;
	}
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf)
	{
		this.takenCareOf = takenCareOf;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getDangerPerc()
	{
		return dangerPerc;
	}
	public void setDangerPerc(double dangerPerc)
	{
		this.dangerPerc = dangerPerc;
	}
	public double getMaintenanceCost()
	{
		return maintenanceCost;
	}
	public void setMaintenanceCost(double maintenanceCost)
	{
		this.maintenanceCost = maintenanceCost;
	}
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs = nrOfLegs;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		createNode(eventWriter,"dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter,"maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter,"nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter,"takenCareOf", String.valueOf(this.takenCareOf));
		createNode(eventWriter,"name", String.valueOf(this.name));
	}
	public void decodeFromXML( Element element) 
	{
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setTakenCareOf (Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		setMaintenanceCost (Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
	}
}
