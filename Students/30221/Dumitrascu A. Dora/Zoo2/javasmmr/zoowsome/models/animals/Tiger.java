package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public Tiger(){
		super(6,0.9);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(30);
		setPercBodyHair(99);
	}
	
	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

}
