package animals;

public class StingBee extends Insect {
	public StingBee() {
		super(1.0, 0.001);
		setNrOfLegs(6);
		setName("StingBee");
		setIsDangerous(true);
		setCanFly(true);
	}

	public StingBee(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}