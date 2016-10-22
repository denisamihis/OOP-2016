package models.animals;

public class Peacock extends Bird{
	public Peacock(){
		setNrOfLegs(2);
		setName("Peacock");
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
	public Peacock(int nrOfLegs , String name , boolean migrates , int avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
