package models.animals;

public class Flamingo extends Bird{
	public Flamingo(){
		super(2.0 ,0.2);
		setMigrates(false);
		setAvgFlightAltitude(10);
		setNrOfLegs(2);
		setName("Flamingo");
	}
	public Flamingo(boolean migrates , int avgFlightAltitude, int nrOfLegs, String name){
		super(2.0 ,0.2);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}