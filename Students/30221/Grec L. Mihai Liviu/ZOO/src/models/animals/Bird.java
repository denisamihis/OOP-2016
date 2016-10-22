package models.animals;

public abstract class Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	
	public boolean getMigrates(){
		return migrates;
	}
	public int avgFlightAltitude(){
		return avgFlightAltitude;
	}
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
