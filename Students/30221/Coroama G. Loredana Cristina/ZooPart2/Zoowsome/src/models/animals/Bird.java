package models.animals;

abstract public class Bird extends Animal{
public Bird(double mn, double dp) {
		super(mn, dp);
		// TODO Auto-generated constructor stub
	}
public boolean migrates;
public int avgFlightAltitude;
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
