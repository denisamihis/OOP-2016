package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{
	public Owl(){
		setNrOfLegs(2);
		setName("Owl");
		setMigrates(Boolean.FALSE);
		setAvgFlightAltitude(2000);
	}
	
	public Owl (Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
