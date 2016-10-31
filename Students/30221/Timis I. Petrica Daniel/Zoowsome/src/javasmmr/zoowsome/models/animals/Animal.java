package javasmmr.zoowsome.models.animals;

import java.util.*;

public abstract class Animal implements Killer {

	private Integer nrOfLegs;
	private String name;
	private final Double maintenanceCost;
	private final Double dangerPerc;
	private boolean takenCareOf;

	public Animal(Double maintenanceCost, Double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc + getPredisposition();
		takenCareOf = false;
	}

	public Double getMaintenanceCost() {
		return maintenanceCost;
	}

	public Double getDangerPerc() {
		return dangerPerc;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Killer Interface Methods
	
	public boolean kill() {
		Random random = new Random();
		double generatedNr = random.nextDouble();
		if (generatedNr < dangerPerc) {
			return true;
		}
		return false;
	}

	public double getPredisposition() {
		return 0.0;
	}

}
