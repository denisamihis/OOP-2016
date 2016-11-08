package models.animals;

import java.util.Random;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;

import models.interfaces.XML_Parsable;
import static repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable {
	private String name;
	private Integer nrOfLegs;
	private Double maintenanceCost;// 0.1-8.0
	private double percKill;// 0-1
	private boolean takenCareOf = false;

	public boolean kill() {
		Random rand = new Random();
		int chance = rand.nextInt(101);
		double percMurder = (double) chance / 100;
		if (percMurder < percKill)
			return false;
		else
			return true;

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "percKill", String.valueOf(this.percKill));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));

	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setPercKill(Double.valueOf(element.getElementsByTagName("percKill").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}

	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	public void setPercKill(double percKill){
		this.percKill=percKill;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public Animal(Double maintaneanceCost, double percKill) {
		this.maintenanceCost = maintaneanceCost;
		this.percKill = percKill;
	}

	public Double getMaintaneanceCost() {
		return maintenanceCost;
	}

	public double getPercKill() {
		return percKill;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;

	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

}
