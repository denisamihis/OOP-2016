package animals;

public class Falcon extends Bird {
	public Falcon() {
		super(3.0, 0.01);
		setNrOfLegs(2);
		setName("Falcon");
		setAvgFlightAltitude(500);
		setMigrates(false);
	}

	public Falcon(Integer nrOfLegs, String name, Integer avgFlightAltitude, Boolean migrates, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}
}
