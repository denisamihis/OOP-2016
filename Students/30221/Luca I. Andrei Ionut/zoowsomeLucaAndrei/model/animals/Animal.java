package animals;

import java.util.Random;
import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import interfaces.XML_Parsable;

public abstract class Animal implements Killer, XML_Parsable {
	private Integer nrOfLegs;
	private String name;
	Double maintenanceCost;
	Double dangerPerc;
	private Boolean takenCareOf = false;

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public Boolean kill() {
		Random random = new Random();
		Double ran = random.nextDouble();
		if (ran < dangerPerc)
			return true;
		else
			return false;
	}

	public Animal(Double maintenanceCost, Double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public void setNrOfLegs(int number) {
		nrOfLegs = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String givenName) {
		name = givenName;
	}

	public Boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public Double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public Double getDangerPerc() {
		return dangerPerc;
	}
	
	public void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc;
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
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}

}