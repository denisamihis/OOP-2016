package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Spider() {
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
	}

}
