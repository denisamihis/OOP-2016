package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Cow() {
		super(1.2, 0.02);
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(38.6f);
		setPercBodyHair(96.1f);
	}
	
}
