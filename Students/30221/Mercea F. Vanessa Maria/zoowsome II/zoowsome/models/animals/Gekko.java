package animals;

public class Gekko extends Reptile {
	public Gekko() {
		super(3.0,0.0001);
		setNrOfLegs(4);
		setName("Gekko");
		setLaysEggs(true);
	}
	
	public Gekko(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean laysEggs) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
