package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird {
	public Chicken(){
		setNrOfLegs(2);
		setName("Chicken");
		setMigrates(Boolean.TRUE);
		setAvgFlightAltitude(0);
	}
	
	public Chicken(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
