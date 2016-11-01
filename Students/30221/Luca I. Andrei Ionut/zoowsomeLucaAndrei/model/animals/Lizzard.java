package animals;

public class Lizzard extends Reptile {
	public Lizzard() {
		super(1.0, 0.00);
		setNrOfLegs(4);
		setName("Lizard");
		setLaysEggs(true);
	}

	public Lizzard(Integer nrOfLegs, String name, Boolean laysEggs, Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);

	}
}
