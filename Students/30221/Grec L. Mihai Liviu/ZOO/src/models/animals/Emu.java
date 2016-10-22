package models.animals;

public class Emu extends Bird{
	public Emu(){
		setNrOfLegs(2);
		setName("Emu");
		setMigrates(true);
		setAvgFlightAltitude(0);
	}
	public Emu(int nrOfLegs , String name , boolean migrates , int avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
