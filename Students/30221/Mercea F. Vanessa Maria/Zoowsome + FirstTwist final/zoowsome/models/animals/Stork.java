package animals;

public class Stork extends Bird {
	public Stork() {
		setNrOfLegs(2);
		setName("Stork");
		setMigrates(true);
		setAvgFlightAltitude(50);
	}
	
	public Stork(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
