package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	
	public Monkey(){
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(35);
		setPercBodyHair(95);
	}
	
	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

}
