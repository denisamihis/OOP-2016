package models.animals;
import static repositories.AnimalRepository.createNode;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.XML_Parsable;

public abstract class Animal implements Killer , XML_Parsable{
	private Integer nrOfLegs;
	private String name;
	protected Double maintenanceCost;
	protected Double dangerPerc;
	private boolean takenCareOf = false;
	Random random = new Random();
	public boolean kill(){
		double predisposition = getPredisposition();
		if (randomDangerPerc + predisposition< dangerPerc)
			return true;
		return false;
	}
	public double getPredisposition(){
		return 0.0;
	}
	protected double randomDangerPerc = random.nextDouble();
	protected Animal(Double maintenanceCost , Double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public Integer  getNrOfLegs(){
		return nrOfLegs;
	}
	public String getName(){
		return name;
	}
	public Double getMaintenanceCost(){
		return maintenanceCost;
	}
	public void setMaintenanceCost(Double maintenanceCost){
		this.maintenanceCost = maintenanceCost;
	}
	public void setDangerPerc(Double dangerPerc){
		this.dangerPerc = dangerPerc;
	}
	public Double getDangerPerc(){
		return dangerPerc;
	}
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setTakenCareOf(Boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		
	}
	public void decodeFromXml(Element element){
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
