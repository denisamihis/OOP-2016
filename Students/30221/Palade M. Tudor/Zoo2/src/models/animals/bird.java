package models.animals;

public abstract class bird extends animals{
	private boolean migrates;
	private int avgFlightAltitude;
	
	protected bird(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setMigrates(boolean attribute){
		migrates = attribute;
	}
	public void setAvgFlightAltitude(int number){
		avgFlightAltitude = number;
	}
	
	public boolean getMigrates(){
		return migrates;
	}
	public int getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
}