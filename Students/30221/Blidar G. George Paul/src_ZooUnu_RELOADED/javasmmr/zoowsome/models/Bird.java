package javasmmr.zoowsome.models;

public abstract class Bird extends Animal {
	
	private boolean migrates;
	private int avgFlightAltitude;
	
	public boolean isMigrating()
	{
		return migrates;
	}
	
	public void setIsMigrating(boolean answer)
	{
		migrates = answer;
	}
	
	public int getAvgFlightAltitude()
	{
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(int value)
	{
		avgFlightAltitude = value;
	}
}
