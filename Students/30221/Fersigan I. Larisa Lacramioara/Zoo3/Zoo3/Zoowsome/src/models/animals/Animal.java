package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static repositories.AnimalRepository.createNode;
import models.interfaces.XML_Parsable;
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;

abstract public class Animal implements Killer,  XML_Parsable{
	private int nrOfLegs;
	private String name;
	public void getAnimal(String name){
		this.getAnimal("animal");
		}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(int legsNr){
		nrOfLegs=legsNr;
	}
	public String getName(){
		return name;
	}
	public void setName(String nume){
		name=nume;
	}
	public final double maintenanceCost;
	public final double dangerPerc;
	public Animal(double mc,double dp ){
		maintenanceCost=mc;
		dangerPerc=dp;
	}
	private boolean takeCareOf=false;
	
	public boolean isTakeCareOf() {
		return takeCareOf;
	}
	public void setTakeCareOf(boolean takeCareOf) {
		this.takeCareOf = takeCareOf;
	}
	
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takeCareOf", String.valueOf(this.takeCareOf));
		}
	public void decodeFromXml(Element element) { 
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent())); 
		setName(element.getElementsByTagName("name").item(0).getTextContent()); 
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent())); 
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent())); 
		setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent())); }
	
	private double setDangerPerc(Double valueOf) {
		// TODO Auto-generated method stub
		return dangerPerc;
	}
	private double setMaintenanceCost(Double valueOf) {
		// TODO Auto-generated method stub
		return maintenanceCost;
	}
	}
		
		
		