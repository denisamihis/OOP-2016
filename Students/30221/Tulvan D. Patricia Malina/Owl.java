package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{
	public Owl(){
		super(3.6,0.0);
		setNrOfLegs(2);
		setName("Owl");
		setMigrates(Boolean.FALSE);
		setAvgFlightAltitude(2000);
	}
	
	public Owl (Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
