package animals;

import java.util.Random;
import java.lang.*;

public abstract class Animal implements Killer{
	private Integer nrOfLegs;
	private String name;
	private Boolean takenCareOf=false;
	public final Double maintenanceCost;
	public final Double dangerPerc;

	public Animal(Double maintenanceCost, Double dangerPerc) {
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs=nrOfLegs;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Boolean getTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf=takenCareOf;
	}
	
	public Double getMaintenanceCost() {
		return maintenanceCost;
	}
	public Double getDangerPerc() {
		return dangerPerc;
	}
	
	public boolean kill() {
		Random random = new Random();
		Double randomValue=random.nextDouble();
		if (randomValue<dangerPerc)
			return true;
		else
			return false;
	}

	
	
}
