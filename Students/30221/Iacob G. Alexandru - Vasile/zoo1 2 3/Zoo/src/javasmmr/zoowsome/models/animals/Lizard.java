package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	public Lizard() {
		super(0.4,0.7);
		this.setNrOfLegs(4);
		this.setName("Bob");
	}
	public Lizard (String name, boolean laysEggs,double dangPerc, double maintenanceCost) {
		super(dangPerc,  maintenanceCost);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}

}
