package models.animals;

public class Cow extends Mammal{
	public Cow(){
		super(0.3 , 0.0);
		setNormalBodyTemp(25);
		setPercBodyHair(0.4);
		setNrOfLegs(4);
		setName("Cow");
	}
	public Cow(float normalBodyTemp , float percBodyHair, int nrOfLegs, String name){
		super(0.3 , 0.0);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}