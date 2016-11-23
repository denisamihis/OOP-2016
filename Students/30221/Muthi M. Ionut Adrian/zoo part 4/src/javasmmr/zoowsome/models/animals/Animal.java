package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.models.interfaces.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Animal implements Killer, XML_Parable  {
	private int nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf=false;
	
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean careOf){
		takenCareOf=careOf;
	}
	
	public final double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	public void setMaintenanceCost(double cost){
		maintenanceCost=cost;
	}
	
	public final double getdangerPerc(){
		return dangerPerc;
	}
	
	public void setdangerPerc(double danger){
		dangerPerc=danger;
	}
	
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int legs){
		nrOfLegs=legs;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String animalName){
		name=animalName;
		
		
	}
	
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setdangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	
	
	
	
}
