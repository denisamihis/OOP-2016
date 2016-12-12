package models.animals;
import static repositories.AnimalRepository.createNode;



import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.XML_Parsable;

abstract public class Animal  implements Killer, XML_Parsable {
	public Animal (double mn,double dp) {
		maintenanceCost =mn;
		
		dangerPerc=dp;
		//if(1<=maintenanceCost && maintenanceCost>=8)
			//getMaintenanceCost();
	}
	private double setMaintenanceCost(Double mn) {
		// TODO Auto-generated method stub
		return maintenanceCost;
		
		
	}
	private  int NrOfLegs;
	private String name;
	public final double maintenanceCost;
	public final double dangerPerc;
	private boolean takenCareOf=false;
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	public void  setNrOfLegs (int NrLegs)
	{
		NrOfLegs=NrLegs;
	}
	public void setName(String nume)
	{
		name=nume;
	}
	
	public int getNrOfLegs(){
		return NrOfLegs;
	}
	public  String getName(){
		return name;
	}
	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.NrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName( "maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}


private double setDangerPerc(Double valueOf) {
		// TODO Auto-generated method stub
		return dangerPerc;
	}

public double getDangerPerc() {
	return dangerPerc;
}



}
