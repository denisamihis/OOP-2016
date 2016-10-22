package models.animals;

public class Eagle extends Bird{
	public Eagle(){
		setNrOfLegs(2);
		setName("Eagle");
		setMigrates(true);
		setAvgFlightAltitude(3000);
	}
	public Eagle(int nrOfLegs , String name , boolean migrates , int avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
