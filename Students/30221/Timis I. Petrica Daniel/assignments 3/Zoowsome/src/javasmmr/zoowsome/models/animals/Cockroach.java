package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Cockroach() {
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(true);
	}

}
