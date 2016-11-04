package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	
	public Monkey(){
		super(5,0.2);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(35);
		setPercBodyHair(95);
	}
	
	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

}
