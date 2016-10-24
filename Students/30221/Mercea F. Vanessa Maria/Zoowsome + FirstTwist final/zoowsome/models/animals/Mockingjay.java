package animals;

public class Mockingjay extends Bird {
	public Mockingjay() {
		setNrOfLegs(2);
		setName("Mockingjay");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	
	public Mockingjay(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
