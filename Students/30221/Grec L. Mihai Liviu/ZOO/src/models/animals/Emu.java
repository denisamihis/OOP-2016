package models.animals;

public class Emu extends Bird{
	public Emu(){
		super(3.2 , 0.18);
		setNrOfLegs(2);
		setName("Emu");
		setMigrates(true);
		setAvgFlightAltitude(0);
	}
	public Emu(Integer nrOfLegs , String name , boolean migrates , Integer avgFlightAltitude){
		super(3.2 , 0.18);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
