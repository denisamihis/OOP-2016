package models.animals;

public class Horse extends Mammal {
	public Horse() {
		setNrOfLegs(4);
	}

	public Horse(String name,float normalBodyTemp,float percBodyHair) {

		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

}
