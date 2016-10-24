package animals;

public class Woodpecker extends Bird {
	public Woodpecker() {
		setNrOfLegs(2);
		setName("Woodpecker");
		setMigrates(true);
		setAvgFlightAltitude(50);
	}
	
	public Woodpecker(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
