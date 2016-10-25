package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	protected boolean laysEggs;
	
	public boolean getLaysEggs () {
		return laysEggs;
	}
	
	public void setLaysEggs (boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
