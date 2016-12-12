package models.animals;

import java.util.Random;

public abstract class Animal implements Killer{
	public int nrOfLegs;
	public String name;
	public final Double maintenanceCost;
	public final Double dangerPerc;
	public boolean takenCareOf =false;
	
	protected Animal(Double maintenaceCost , Double dangerPerc){
		this.maintenanceCost = maintenaceCost;
		this.dangerPerc = dangerPerc;
	}
	
	Random random = new Random();
	public boolean kill(){
		if (random.nextDouble() < dangerPerc)
			return true;  // omoara
		return false;	  // nu omoara
	}
	
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getNrOfLegs (){
		return nrOfLegs;
	}
	public String getName (){
		return name;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	public boolean getTakenCareOf (){
		return takenCareOf;
	}
}