package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow (float normalBodyTemp, float percBodyHair){
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	public Cow (){
		nrOfLegs=4;
		name="Cow";		
	}
}
