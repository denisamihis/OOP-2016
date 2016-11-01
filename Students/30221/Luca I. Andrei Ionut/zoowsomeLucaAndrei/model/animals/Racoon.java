package animals;

public class Racoon extends Mammal {
	public Racoon() {
		super(2.0, 0.00);
		setNrOfLegs(4);
		setName("Racoon");
		setPercBodyHair(70);
		setNormalBodyTemp(35);
	}

	public Racoon(Integer nrOfLegs, String name, Float percBodyHair, Float normalBodyTemp, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setPercBodyHair(percBodyHair);
		setNormalBodyTemp(normalBodyTemp);
	}
}
