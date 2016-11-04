package animals;

public class Snake extends Reptile {
	public Snake() {
		super(2.0,0.002);
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(false);
	}
	
	public Snake(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean laysEggs) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
