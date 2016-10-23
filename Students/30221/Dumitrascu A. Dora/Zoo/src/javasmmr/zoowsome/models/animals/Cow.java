package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	
	public Cow(){
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(40);
		setPercBodyHair(70);
	}
	
	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

}
