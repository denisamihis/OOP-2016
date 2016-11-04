package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer{
	protected int nrOfLegs;
	protected String name;
	protected boolean takenCareOf;
	public final double maintenanceCost;
	public final double dangerPerc;
	
	public boolean kill(){
		double randomNum=Math.random();
		if(randomNum<dangerPerc)
			return true;
		else
			return false;
	}
	
	public Animal(double maintenanceCost, double dangerPerc){
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	
	public boolean getCare(){
		return takenCareOf;
	}
	
	public void setCare(boolean takenCareOf){
		this.takenCareOf=takenCareOf;
	}
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs=nrOfLegs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
