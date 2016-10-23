package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Tiger() {
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.5f);
		setPercBodyHair(92.2f);
	}

}
