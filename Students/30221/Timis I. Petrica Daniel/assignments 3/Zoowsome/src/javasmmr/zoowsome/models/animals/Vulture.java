package javasmmr.zoowsome.models.animals;

public class Vulture extends Bird {

	public Vulture(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Vulture() {
		setNrOfLegs(2);
		setName("Vulture");
		setMigrates(true);
		setAvgFlightAltitude(11300);
	}
	
}
