package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Cow() {
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(38.6f);
		setPercBodyHair(96.1f);
	}
	
}
