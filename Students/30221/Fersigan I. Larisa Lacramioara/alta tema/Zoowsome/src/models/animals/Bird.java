package models.animals;

public abstract class Bird extends Animal{
	public Bird(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	public boolean migrates;		//Does it migrate or not?
	public int avgFlightAltitude;		//Average flight altitude
	public boolean isMigrates() {
		return migrates;
	}
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
