package models.animals;

public class Tiger extends Mammal{
	public Tiger(){
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.5);
		setPercBodyHair(0.2);
	}
	public Tiger(int nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
