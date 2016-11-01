package animals;


public class Lion extends Mammal {
	public Lion() {
		super(2.0, 0.06);
		setNrOfLegs(4);
		setName("Lion");
		setPercBodyHair(80);
		setNormalBodyTemp(38);
	}

	public Lion(Integer nrOfLegs, String name, Float percBodyHair, Float normalBodyTemp, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setPercBodyHair(percBodyHair);
		setNormalBodyTemp(normalBodyTemp);
	}
}
