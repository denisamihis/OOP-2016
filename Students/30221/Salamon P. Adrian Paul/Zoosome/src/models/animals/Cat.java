package models.animals;

public class Cat extends Mammal {
	public Cat() {
		setNrOfLegs(4);
	}

	public Cat(String name, float normalBodyTemp, float percBodyHair) {
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
