package models.animals;

public class Lion extends Mammal{
	public Lion(){
		setNrOfLegs(4);
		setName("Lion");
		setNormalBodyTemp(38.5);
		setPercBodyHair(0.4);
	}
		public Lion(int nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
			setNrOfLegs(nrOfLegs);
			setName(name);
			setNormalBodyTemp(normalBodyTemp);
			setPercBodyHair(percBodyHair);
		}
}

