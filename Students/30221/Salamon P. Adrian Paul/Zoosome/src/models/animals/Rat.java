package models.animals;

public class Rat extends Mammal {
	public Rat() {
		setNrOfLegs(4);
	}
	public Rat(String name,float normalBodyTemp,float percBodyHair){
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}

