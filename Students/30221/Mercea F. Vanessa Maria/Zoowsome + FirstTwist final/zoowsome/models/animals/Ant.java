package animals;

public class Ant extends Insect {
	public Ant() {
		setNrOfLegs(6);
		setName("Ant");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Ant(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
