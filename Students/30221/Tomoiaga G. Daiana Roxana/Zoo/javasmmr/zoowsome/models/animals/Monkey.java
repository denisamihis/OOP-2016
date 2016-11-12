package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey (float normalBodyTemp, float percBodyHair){
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	public Monkey (){
		nrOfLegs=2;
		name="Monkey";
	}

}
