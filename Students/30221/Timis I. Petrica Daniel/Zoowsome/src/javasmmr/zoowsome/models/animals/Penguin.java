package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	
	public Penguin(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Penguin() {
		super(5.5, 0.0);
		this.setNrOfLegs(2);
		this.setName("Penguin");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
	}

}
