package animals;

public class Gekko extends Reptile {
	public Gekko() {
		setNrOfLegs(4);
		setName("Gekko");
		setLaysEggs(true);
	}
	
	public Gekko(Integer nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
