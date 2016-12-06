package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	private final double DANG_PERC;
	private final double MAINTENANCE_COST;
	private boolean takenCareOf = false;
	public Animal () {
		this.MAINTENANCE_COST = 0.1;
		this.DANG_PERC = 0;
	}
	public Animal ( double dangPerc, double maintenanceCost) {
		this.MAINTENANCE_COST = maintenanceCost;
		this.DANG_PERC = dangPerc;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getDANG_PERC() {
		return DANG_PERC;
	}
	public double getMAINTENANCE_COST() {
		return MAINTENANCE_COST;
	}
	
	public boolean kill() {
		Random random = new Random();
		double a = random.nextDouble();
		if ( a < DANG_PERC) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.MAINTENANCE_COST));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.DANG_PERC));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	

	

}
