package animals;

public class Cameleon extends Reptile {
	public Cameleon() {
		super(2.0, 0.00);
		setNrOfLegs(4);
		setName("Cameleon");
		setLaysEggs(true);
	}

	public Cameleon(Integer nrOfLegs, String name, Boolean laysEggs, Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);

	}
}
