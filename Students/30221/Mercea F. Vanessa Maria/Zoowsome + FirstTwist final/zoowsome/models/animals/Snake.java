package animals;

public class Snake extends Reptile {
	public Snake() {
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(false);
	}
	
	public Snake(Integer nrOfLegs, String name, boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
