package javasmmr.zoowsome.models.animals;

public class Ostrich extends Bird {

	public Ostrich(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Ostrich() {
		super(2.7, 0.07);
		setNrOfLegs(2);
		setName("Ostrich");
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
	
}
