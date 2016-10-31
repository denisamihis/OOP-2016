package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Cockroach() {
		super(0.2, 0.01);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(true);
	}

}
