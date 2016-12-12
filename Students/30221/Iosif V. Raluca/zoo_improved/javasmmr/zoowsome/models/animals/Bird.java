package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;
	
	public boolean getMigrates(){
		return migrates;
	}
	
	public Integer getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates=migrates;
	}
	
	public void setAvgFlightAltitude(int altitude){
		avgFlightAltitude=altitude;
	}
}
