package animals;

public class Woodpecker extends Bird {
	public Woodpecker() {
		super(1.0,0.0001);
		setNrOfLegs(2);
		setName("Woodpecker");
		setMigrates(true);
		setAvgFlightAltitude(50);
	}
	
	public Woodpecker(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avgFlightAltitude) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
