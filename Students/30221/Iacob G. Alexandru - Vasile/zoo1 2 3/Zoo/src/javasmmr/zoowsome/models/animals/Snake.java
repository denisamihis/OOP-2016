package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake() {
		super(0.8,5.9);
		this.setNrOfLegs(1);
		this.setName("Sneaky");
	}
	public Snake (String name, boolean laysEggs,double dangPerc, double maintenanceCost) {
		super(dangPerc,maintenanceCost);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
}
