package animals;

public class Stork extends Bird {
	public Stork() {
		super(2.0,0.0001);
		setNrOfLegs(2);
		setName("Stork");
		setMigrates(true);
		setAvgFlightAltitude(50);
	}
	
	public Stork(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avgFlightAltitude) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
