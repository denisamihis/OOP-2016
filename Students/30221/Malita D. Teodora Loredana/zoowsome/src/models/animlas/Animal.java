package models.animlas;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
import models.interfaces.XML_Parsable;
import repositories.AnimalRepository;

public abstract class Animal implements Killer, XML_Parsable {
	protected String name;
	protected int nrOfLegs;
	protected double maintenanceCost;
	protected double dangPerc;
	protected boolean takenCareOf;
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		AnimalRepository.createNode(eventWriter,"nrOfLegs",String.valueOf(this.nrOfLegs));
		AnimalRepository.createNode(eventWriter,"name",String.valueOf(this.name));
		AnimalRepository.createNode(eventWriter,"maintenanceCost",String.valueOf(this.maintenanceCost));
		AnimalRepository.createNode(eventWriter,"dangPerc",String.valueOf(this.maintenanceCost));
		AnimalRepository.createNode(eventWriter,"takenCareOf",String.valueOf(this.takenCareOf));
	}
	public void decodeFromXml(Element element){
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName( element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangPerc(Double.valueOf(element.getElementsByTagName("dangPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	public Animal(String name, int nrOfLegs,double maintenanceCost,double dangPerc) {
		this.maintenanceCost=maintenanceCost;
		this.name = name;
		this.nrOfLegs=nrOfLegs;
		this.dangPerc = dangPerc;
		takenCareOf = false;
	}
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf)
	{
		this.takenCareOf=takenCareOf;
	}
	public boolean kill()
	{
		Random kills = new Random();
		double v;
		v=kills.nextDouble();
		return v<dangPerc;
	}
	public double getDangPerc()
	{
		return dangPerc;
	}
	public void setDangPerc(double dangPerc){
			this.dangPerc=dangPerc;
		
	}
	public void setMaintenanceCost(double maintenanceCost){
		this.maintenanceCost= maintenanceCost;
	}
	public double getMaintenanceCost()
	{
		return maintenanceCost;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getNrOfLegs()
	{
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs=nrOfLegs;
	}

}
