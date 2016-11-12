package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird {
	public Chicken(){
		super(2.1,0.0);
		setNrOfLegs(2);
		setName("Chicken");
		setMigrates(Boolean.TRUE);
		setAvgFlightAltitude(0);
	}
	
	public Chicken(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
