package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(int nrOfLegs, String name, boolean layEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Lizard() {
		setNrOfLegs(4);
		setName("Lizard");
		setLayEggs(true);
	}
	
}
