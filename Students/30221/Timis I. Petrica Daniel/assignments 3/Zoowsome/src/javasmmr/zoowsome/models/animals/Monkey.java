package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(37.3f);
		setPercBodyHair(93.5f);
	}
	
}
