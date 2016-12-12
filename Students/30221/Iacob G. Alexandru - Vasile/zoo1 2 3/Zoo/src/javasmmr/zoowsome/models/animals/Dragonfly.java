package javasmmr.zoowsome.models.animals;

public class Dragonfly extends Insect {
	public Dragonfly() {
		super(0,0.3);
		this.setNrOfLegs(6);
		this.setName("Droko");
	}
	public Dragonfly(String name, boolean canFly, boolean isDangerous,double dangPerc, double maintenanceCost){
		super(dangPerc,maintenanceCost);
		this.setName(name);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}
}
