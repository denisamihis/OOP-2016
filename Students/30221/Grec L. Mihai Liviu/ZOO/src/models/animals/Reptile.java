package models.animals;

public abstract class Reptile extends Animal {
	private boolean laysEggs;
	protected Reptile(Double maintenanceCost , Double dangerPerc) {
		super(maintenanceCost , dangerPerc);
	}
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}
	public boolean getLaysEggs(){
		return laysEggs;
	}
}
