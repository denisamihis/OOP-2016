package javasmmr.zoowsome.models.animals;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable{
	private Integer nrOfLegs;
	private String name;
	private Double maintenanceCost; //holds how many hours per week an animal requires
	private Double dangerPerc;
	private Boolean takenCareOf;
	
	public Animal(Double maintenanceCost, Double dangerPerc){
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc+ getPredisposition();
		this.takenCareOf=false;
	}
	
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs=nrOfLegs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setTakenCareOf(Boolean takenCareOf){
		this.takenCareOf=takenCareOf;
	}
	
	public Boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setMaintenanceCost(Double maintenanceCost){
		this.maintenanceCost=maintenanceCost;
	}
	
	public Double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	public void setDangerPerc(Double dangerPerc){
		this.dangerPerc=dangerPerc;
	}
	
	public Double getDangerPerc(){
		return dangerPerc;
	}
	
	//From Killer interface
	public boolean kill(){
		Random random= new Random();
		Double randomDangerPerc= random.nextDouble();
		if(randomDangerPerc < dangerPerc)	
			return true; 
		return false;
	}

	public double getPredisposition(){
		return 0.0;
	}
	
	
	//From XML_Parsable interface
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
