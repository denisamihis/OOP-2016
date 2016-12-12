package animals;

public class Seaturtle extends Reptile {
	public Seaturtle() {
		setNrOfLegs(2);
		setName("Seaturtle");
		setLaysEggs(true);
	}
	
	public Seaturtle(Integer nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
