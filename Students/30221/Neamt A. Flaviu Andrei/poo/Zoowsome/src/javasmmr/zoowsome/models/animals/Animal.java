package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.interfaces.*;
import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Animal implements Killer{
	public int nrOfLegs;
	public String name;
	public double maitenanceCost,dangerPerc;
	public boolean takenCareOf=false;
	private char[] maintenanceCost;
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(int legs){
		nrOfLegs=legs;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		name=this.name;
	}
	public double getMaitenanceCost(){
		return maitenanceCost;
	}
	public void setMaitenanceCost(double cost ){
		maitenanceCost=cost;
	}
	public double getDangerPerc(){
		return dangerPerc;
	}
	public void setDangerPerc(double perc){
		dangerPerc=perc;
	}
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf){
		takenCareOf=this.takenCareOf;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double. valueOf(element.getElementsByTagName( "maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}
}
