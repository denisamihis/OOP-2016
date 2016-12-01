package models.animals;

public class Peacock extends Bird{
	public Peacock(){
		super(3.2 ,0.0);
		setMigrates(true);
		setAvgFlightAltitude(2);
		setNrOfLegs(2);
		setName("Peacock");
	}
	public Peacock(boolean migrates , int avgFlightAltitude, int nrOfLegs, String name){
		super(3.2 ,0.0);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}