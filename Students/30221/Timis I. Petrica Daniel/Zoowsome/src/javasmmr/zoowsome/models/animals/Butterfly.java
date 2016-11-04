package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Butterfly() {
		super(0.5, 0.0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
	}

}
