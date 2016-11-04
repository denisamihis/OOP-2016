package javasmmr.zoowsome.models.animals;



public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	private double maintenanceCost;//range 0.1 to 8.0
	private double dangerPerc;//values in [0,1] interval
	private boolean takenCareOf=false;
	
	
	
	public int getNrOfLegs(){
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(int number){
		nrOfLegs=number;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public final void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	
}
