package animals;

public class Pelican extends Bird {
	public Pelican() {
		super(2.0, 0.00);
		setNrOfLegs(2);
		setName("Pelican");
		setAvgFlightAltitude(300);
		setMigrates(true);
	}

	public Pelican(Integer nrOfLegs, String name, Integer avgFlightAltitude, Boolean migrates, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}

}