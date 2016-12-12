package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly() {
		super();
		this.setNrOfLegs(6);
		this.setName("Puff");
	}
	public Butterfly(String name, boolean canFly, boolean isDangerous,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}

}
