package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Bird extends Animal {
	
	private boolean migrates;
	private int avgFlightAltitude;
	
	
	

	
	public boolean getMigrates(){
		return migrates;
	}
	
	public int getAvgFligthAltitude(){
		return avgFlightAltitude;
		
	}
	
	public void setMigrtaes(boolean migrate){
		migrates=migrate;
	}
	public void setAvgFligthAltitude(int altitude){
		avgFlightAltitude=altitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFligthAltitude()));
		}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		}
}
