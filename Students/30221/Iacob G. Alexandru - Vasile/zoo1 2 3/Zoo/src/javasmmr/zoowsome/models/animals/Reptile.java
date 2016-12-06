package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private boolean laysEggs;

	public Reptile(double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
	}
	public Reptile() {
		super();
	}

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
