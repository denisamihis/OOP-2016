package animals;

public class Seaturtle extends Reptile {
	public Seaturtle() {
		super(3.0,0.0001);
		setNrOfLegs(2);
		setName("Seaturtle");
		setLaysEggs(true);
	}
	
	public Seaturtle(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean laysEggs) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
