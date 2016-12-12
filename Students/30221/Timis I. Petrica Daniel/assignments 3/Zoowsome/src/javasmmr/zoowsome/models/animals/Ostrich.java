package javasmmr.zoowsome.models.animals;

public class Ostrich extends Bird {

	public Ostrich(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Ostrich() {
		setNrOfLegs(2);
		setName("Ostrich");
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
	
}
