package animals;

public class PolarBear extends Mammal {
	public PolarBear() {
		super(3.0, 0.003);
		setNrOfLegs(4);
		setName("PolarBear");
		setPercBodyHair(90);
		setNormalBodyTemp(40);
	}

	public PolarBear(Integer nrOfLegs, String name, Float percBodyHair, Float normalBodyTemp, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setPercBodyHair(percBodyHair);
		setNormalBodyTemp(normalBodyTemp);
	}
}
