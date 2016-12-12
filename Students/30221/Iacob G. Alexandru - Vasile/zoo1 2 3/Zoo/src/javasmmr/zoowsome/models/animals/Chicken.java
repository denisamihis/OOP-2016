package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird {
	public Chicken() {
		super(0,0.1);
		this.setNrOfLegs(2);
		this.setName("Egg");
	}
	public Chicken(String name, boolean migrates, int avgFlightAltitude,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}

}
