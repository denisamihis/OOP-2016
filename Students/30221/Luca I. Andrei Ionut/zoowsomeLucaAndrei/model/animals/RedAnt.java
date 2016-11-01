package animals;

public class RedAnt extends Insect {
	public RedAnt() {
		super(1.0, 0.001);
		setNrOfLegs(6);
		setName("RedAnt");
		setCanFly(false);
		setIsDangerous(true);
	}

	public RedAnt(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
