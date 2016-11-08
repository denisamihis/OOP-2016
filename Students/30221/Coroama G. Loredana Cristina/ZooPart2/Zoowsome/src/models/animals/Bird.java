package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Bird extends Animal{
public Bird(double mn, double dp) {
		super(mn, dp);
		// TODO Auto-generated constructor stub
	}
public boolean migrates;
public int avgFlightAltitude;
public boolean isMigrates() {
	return migrates;
}
public void setMigrates(boolean migrates) {
	this.migrates = migrates;
}
public int getAvgFlightAltitude() {
	return avgFlightAltitude;
}
public void setAvgFlightAltitude(int avgFlightAltitude) {
	this.avgFlightAltitude = avgFlightAltitude;
}


public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	super.encodeToXml(eventWriter);
	createNode(eventWriter, "migrates", String.valueOf(isMigrates()));
	createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}
	public void decodeFromXml(Element element) {
	setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
	setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
