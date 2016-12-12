package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger() {
		super();
		this.setNrOfLegs(4);
		this.setName("Rashan");
	}
	public Tiger (String name, float normalBodyTemp, float percBodyHair,double dangPerc, double maintenanceCost) {
		super(dangPerc,maintenanceCost);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}


}
