package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey() {
		super();
		this.setNrOfLegs(2);
		this.setName("Karl");
	}
	
	public Monkey (String name, float normalBodyTemp, float percBodyHair,double dangPerc, double maintenanceCost) {
		super(dangPerc,maintenanceCost);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}


}
