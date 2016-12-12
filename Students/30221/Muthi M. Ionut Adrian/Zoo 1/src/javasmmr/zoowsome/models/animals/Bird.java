package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	
	private boolean migrates;
	private int avgFlightAltitude;
	
	
	

	
	public boolean getMigrates(){
		return migrates;
	}
	
	public int getAvgFligthAltitude(){
		return avgFlightAltitude;
		
	}
	
	public void setMigrtaes(boolean migrate){
		migrates=migrate;
	}
	public void setAvgFligthAltitude(int altitude){
		avgFlightAltitude=altitude;
	}
	

}
