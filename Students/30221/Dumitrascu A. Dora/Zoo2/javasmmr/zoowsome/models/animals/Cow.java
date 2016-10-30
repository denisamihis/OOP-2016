package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	
	public Cow(){
		super(3.3,0);
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(40);
		setPercBodyHair(70);
	}
	
	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

}
