package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile() {
		super();
		this.setNrOfLegs(4);
		this.setName("Tic-Tac");
	}
	public Crocodile (String name, boolean laysEggs,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}

}
