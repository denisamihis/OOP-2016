package javasmmr.zoowsome.models.animals;



public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf=false;
	
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean careOf){
		takenCareOf=careOf;
	}
	
	public final double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	public void setMaintenanceCost(double cost){
		maintenanceCost=cost;
	}
	
	public final double getdangerPerc(){
		return dangerPerc;
	}
	
	public void setdangerPerc(double danger){
		dangerPerc=danger;
	}
	
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int legs){
		nrOfLegs=legs;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String animalName){
		name=animalName;
		
		
	}
	
	
	
	
}
