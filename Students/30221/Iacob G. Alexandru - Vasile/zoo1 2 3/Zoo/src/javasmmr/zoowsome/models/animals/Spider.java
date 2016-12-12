package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider() {
		super(0.8,4.6);
		this.setNrOfLegs(8);
		this.setName("Man");
		this.setCanFly(false);
		this.setDangerous(true);
	}
	public Spider(String name,int nrOfLegs, boolean canFly, boolean isDangerous,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}
}
