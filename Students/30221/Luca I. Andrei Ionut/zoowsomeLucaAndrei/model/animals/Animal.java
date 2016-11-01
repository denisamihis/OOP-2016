package animals;

import java.util.Random;

public abstract class Animal implements Killer {
	private Integer nrOfLegs;
	private String name;
	final Double maintenanceCost;
	final Double dangerPerc;
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

	public Double getDangerPerc() {
		return dangerPerc;
	}
}