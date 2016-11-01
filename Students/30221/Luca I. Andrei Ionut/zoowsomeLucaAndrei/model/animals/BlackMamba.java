package animals;

public class BlackMamba extends Reptile {
	public BlackMamba() {
		super(3.0, 0.05);
		setNrOfLegs(0);
		setName("BlackMamba");
		setLaysEggs(true);
	}

	public BlackMamba(Integer nrOfLegs, String name, Boolean laysEggs, Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);

	}
}