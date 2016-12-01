package models.animals;

abstract class Bird extends Animal{
	boolean migrates;
	int avgFlightAltitude;
	
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public boolean getMigrates(){
		return migrates;
	}
	
	public int getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
	
	protected Bird(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	};
}
