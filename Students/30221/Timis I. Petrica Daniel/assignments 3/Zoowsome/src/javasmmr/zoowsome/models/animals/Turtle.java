package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle(int nrOfLegs, String name, boolean layEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Turtle() {
		setNrOfLegs(4);
		setName("Turtle");
		setLayEggs(true);
	}

}
