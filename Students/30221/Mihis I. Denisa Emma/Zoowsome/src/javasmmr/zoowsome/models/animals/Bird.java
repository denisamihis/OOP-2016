package javasmmr.zoowsome.models.animals;

public abstract class  Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	public Bird(String name, int numberOfLegs,boolean migrates,int avgFlightAltitude) {
		super(name, numberOfLegs);
		setMigrates(migrates);
		
	}
	
	public void setMigrates(boolean migrates)
	{
		 this.migrates=migrates;
	}
	public Boolean getMigrates(boolean migrates)
	{
		 return migrates;
	}
	public void setFlightAltitude(int avgFlightAltitude)
	{
		 this.avgFlightAltitude=avgFlightAltitude;
	}
	public int getFlightAltitude(int avgFlightAltitude)
	{
		 return avgFlightAltitude;
	}
	
}
