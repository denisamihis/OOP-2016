package animals;

public class Mosquito extends Insect {
	public Mosquito() {
		super(3.0,0.0002);
		setNrOfLegs(6);
		setName("Mosquito");
		setCanFly(true);
		setIsDangerous(true);
	}
	
	public Mosquito(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean canFly, boolean isDangerous) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
