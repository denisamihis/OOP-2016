package models.animals;

public class Kangaroo extends Mammal{
	public Kangaroo(){
		setNrOfLegs(4);
		setName("Kangaroo");
		setNormalBodyTemp(36);
		setPercBodyHair(0.1);
	}
	public Kangaroo(int nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
			setNrOfLegs(nrOfLegs);
			setName(name);
			setNormalBodyTemp(normalBodyTemp);
			setPercBodyHair(percBodyHair);
	}
	
}
