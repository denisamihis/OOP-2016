package javasmmr.zoowsome.models.animals;

public class Bird extends Animal{

	public Bird(double maintCosts,double precDanger) {
		super(maintCosts,precDanger);
		// TODO Auto-generated constructor stub
	}
	private boolean migrates;
	private int avgFlyAltitude;
	public int getAvgFlyAltitude()
	{
		return avgFlyAltitude;
	}
	public void setAvgFlyAltitude(int avgFlyAltitude)
	{
		this.avgFlyAltitude=avgFlyAltitude;
	}
	public boolean getMigration()
	{
		return migrates;
	}
	public void setMigration(boolean migrates)
	{
		this.migrates=migrates;
	}
}
