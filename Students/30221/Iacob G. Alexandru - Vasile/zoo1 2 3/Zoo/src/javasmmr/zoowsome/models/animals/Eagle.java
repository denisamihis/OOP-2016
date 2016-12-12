package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	public Eagle() {
		super(0.6,0.8);
		this.setNrOfLegs(2);
		this.setName("America");
	}
	public Eagle (String name, boolean migrates, int avgFlightAltitude,double dangPerc, double maintenanceCost) {
		super(dangPerc,maintenanceCost);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}

}
