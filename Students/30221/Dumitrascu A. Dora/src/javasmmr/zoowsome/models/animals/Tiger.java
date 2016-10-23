package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public Tiger(){
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(30);
		setPercBodyHair(99);
	}
	
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

}
