package animals;

public class Mosquito extends Insect {
	public Mosquito() {
		setNrOfLegs(6);
		setName("Mosquito");
		setCanFly(true);
		setIsDangerous(true);
	}
	
	public Mosquito(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
