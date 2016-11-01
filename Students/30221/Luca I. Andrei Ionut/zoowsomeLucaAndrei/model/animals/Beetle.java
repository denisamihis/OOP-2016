package animals;

public class Beetle extends Insect {
	public Beetle() {
		super(1.0, 0.00);
		setNrOfLegs(6);
		setName("Beetle");
		setCanFly(true);
		setIsDangerous(false);
		
	}

	public Beetle(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
