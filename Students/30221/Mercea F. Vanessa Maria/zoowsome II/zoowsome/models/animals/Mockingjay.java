package animals;

public class Mockingjay extends Bird {
	public Mockingjay() {
		super(2.0,0.0001);
		setNrOfLegs(2);
		setName("Mockingjay");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	
	public Mockingjay(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avgFlightAltitude) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
