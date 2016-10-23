package models.animals;

public abstract class Bird extends Animal{
	protected boolean migrates;
	protected int avgFlightAltitude;
	public Bird(boolean migrates, int avgFlightAltitude, String name)
	{
		super(name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	public boolean getMigrates()
	{
		return migrates;
	}
	public void setMigrates(boolean migrates)
	{
		this.migrates = migrates;
	}
	public int getAvgFlightAltitude()
	{
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude)
	{
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
