package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		super(2.1, 0.05);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(37.3f);
		setPercBodyHair(93.5f);
	}
	
}
