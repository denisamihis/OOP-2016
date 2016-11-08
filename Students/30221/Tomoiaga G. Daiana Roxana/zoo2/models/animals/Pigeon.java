package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {
	
	public Pigeon (int nrOfLegs, String name, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Pigeon (){
		super(1.8, 0.0);
		setNrOfLegs(2);
		setName("Pigeon");
		setMigrates(false);
		setAvgFlightAltitude(30);
	}
	

}
