package javasmmr.zoowsome.models.animals;


public class Cow extends Mammal {
	public Cow() {
		super();
		this.setNrOfLegs(4);
		this.setName("Janna");
	}
	public Cow(String name, float normalBodyTemp, float percBodyHair,double dangPerc, double maintenanceCost) {
		super(dangPerc,maintenanceCost);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	

}
