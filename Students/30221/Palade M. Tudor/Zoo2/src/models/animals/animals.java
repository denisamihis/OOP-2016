package models.animals;

import java.util.Random;

public abstract class animals{
	private int nrOfLegs;
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
	protected animals (Double maintenanceCost, Double dangerPerc){
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	public void setTakenCareOf( boolean takenCareOf){
		this.takenCareOf= takenCareOf;
	}
	public void setNrOfLegs(int nr){
		nrOfLegs = nr;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public String getName(){
		return name;
	}
	
}