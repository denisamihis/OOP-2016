package javasmmr.zoowsome.models.animals;
import javax.xml.stream.XMLEventWriter;

import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.*;

public abstract class Animal implements Killer,XML_Parsable{
	protected int nrOfLegs;
	protected String name;
	protected boolean takenCareOf;
	public final double maintenanceCost;
	public final double dangerPerc;
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		createNode(eventWriter,"nrOfLegs",String.valueOf(this.nrOfLegs));
		createNode(eventWriter,"name",String.valueOf(this.name));
		createNode(eventWriter,"maintenanceCost",String.valueOf(this.maintenanceCost));
		createNode(eventWriter,"dangerPerc",String.valueOf(this.dangerPerc));
		createNode(eventWriter,"takenCareOf",String.valueOf(this.takenCareOf));
	}
	
	
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setCare(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}
	
	public boolean kill(){
		double randomNum=Math.random();
		if(randomNum<dangerPerc)
			return true;
		else
			return false;
	}
	
	
	public Animal(double maintenanceCost, double dangerPerc){
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public void setMaintenanceCost(double maintenanceCost){	}// :(
	public void setDangerPerc(double dangerPerc){ } //hmm? 
	
	public double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	public double getDangerPerc(){
		return dangerPerc;
	}
	
	
	public boolean getCare(){
		return takenCareOf;
	}
	
	public void setCare(boolean takenCareOf){
		this.takenCareOf=takenCareOf;
	}
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs=nrOfLegs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
