package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{
	public Eagle(){
		super(3.2,0.73);
		setNrOfLegs(2);
		setName("Eagle");
		setMigrates(Boolean.FALSE);
		setAvgFlightAltitude(10000);
	}
	
	public Eagle(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
