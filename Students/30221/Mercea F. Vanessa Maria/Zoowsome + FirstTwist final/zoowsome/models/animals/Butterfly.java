package animals;

public class Butterfly extends Insect {
	public Butterfly() {
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
	}
	
	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
}
