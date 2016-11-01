package animals;

public class BlackSparrow extends Bird {
	public BlackSparrow() {
		super(1.0, 0.00);
		setNrOfLegs(2);
		setName("BlackSparrow");
		setAvgFlightAltitude(150);
		setMigrates(false);
	}

	public BlackSparrow(Integer nrOfLegs, String name, Integer avgFlightAltitude, Boolean migrates,
			Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}
}