package models.animals;

public class Eagle extends Bird{
	public Eagle(){
		super(8.0 ,0.1);
		setMigrates(false);
		setAvgFlightAltitude(300);
		setNrOfLegs(2);
		setName("Eagle");
	}
	public Eagle(boolean migrates , int avgFlightAltitude, int nrOfLegs, String name){
		super(8.0 , 0.1);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}