package models.animals;

import java.util.Random;

public abstract class Animal implements Killer{
	private Integer nrOfLegs;
	private String name;
	protected final Double maintenanceCost;
	protected final Double dangerPerc;
	private boolean takenCareOf = false;
	Random random = new Random();
	public boolean kill(){
		double predisposition = getPredisposition();
		if (randomDangerPerc + predisposition< dangerPerc)
			return true;
		return false;
	}
	public double getPredisposition(){
		return 0.0;
	}
	protected double randomDangerPerc = random.nextDouble();
	protected Animal(Double maintenanceCost , Double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public Integer  getNrOfLegs(){
		return nrOfLegs;
	}
	public String getName(){
		return name;
	}
	public Double getMaintenanceCost(){
		return maintenanceCost;
	}
	public Double getDangerPerc(){
		return dangerPerc;
	}
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
}
