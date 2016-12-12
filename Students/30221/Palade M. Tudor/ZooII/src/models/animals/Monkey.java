package models.animals;

public class Monkey extends Mammal{
	public Monkey(){
		super(4.5 ,0.5);
		setNormalBodyTemp(23);
		setPercBodyHair(34.3);
		setNrOfLegs(4);
		setName("Monkey");
	}
	public Monkey(float normalBodyTemp , float percBodyHair, int nrOfLegs, String name){
		super(4.5 ,0.5);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}