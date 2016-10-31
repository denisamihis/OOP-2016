package models.animals;

public abstract class Bird extends Animal{
	private boolean migrates;
	private Integer avgFlightAltitude;
	protected Bird(Double maintenanceCost , Double dangerPerc) {
		super(maintenanceCost , dangerPerc);
	}
	public boolean getMigrates(){
		return migrates;
	}
	public Integer avgFlightAltitude(){
		return avgFlightAltitude;
	}
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	public void setAvgFlightAltitude(Integer avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
