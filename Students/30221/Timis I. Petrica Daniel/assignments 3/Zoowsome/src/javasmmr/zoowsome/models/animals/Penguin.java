package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	
	public Penguin(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Penguin() {
		this.setNrOfLegs(2);
		this.setName("Penguin");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
	}

}
