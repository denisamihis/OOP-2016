package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {
	public Pigeon() {
		super(0.0,0.7);
		this.setNrOfLegs(2);
		this.setName("Bread");
	}
	public Pigeon (String name, boolean migrates, int avgFlightAltitude,double dangPerc, double maintenanceCost) {
		super( dangPerc,maintenanceCost);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}

}
