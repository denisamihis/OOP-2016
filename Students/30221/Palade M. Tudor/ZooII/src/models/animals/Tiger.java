package models.animals;

public class Tiger extends Mammal{
	public Tiger(){
		super(8.0 , 0.9);
		setNormalBodyTemp(30);
		setPercBodyHair(2);
		setNrOfLegs(4);
		setName("Tiger");
	}
	public Tiger(float normalBodyTemp , float percBodyHair, int nrOfLegs, String name){
		super(8.0 , 0.9);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}