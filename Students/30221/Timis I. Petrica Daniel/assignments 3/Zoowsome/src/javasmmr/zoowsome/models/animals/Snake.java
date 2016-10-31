package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(int nrOfLegs, String name, boolean layEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Snake() {
		setNrOfLegs(0);
		setName("Snake");
		setLayEggs(true);
	}
	
}
