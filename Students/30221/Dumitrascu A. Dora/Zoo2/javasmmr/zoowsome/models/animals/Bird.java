package javasmmr.zoowsome.models.animals;

abstract class Bird extends Animal{
	protected boolean migrates;
	protected int avgFlightAltitude;
	
	public Bird(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public boolean getMigrates(){
		return migrates;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates=migrates;
	}
	
	public int getFlighAltitude(){
		return avgFlightAltitude;
	}
	
	public void setFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude=avgFlightAltitude;
	}
}
