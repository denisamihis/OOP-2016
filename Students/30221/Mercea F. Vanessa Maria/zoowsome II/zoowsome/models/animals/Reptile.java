package animals;

public abstract class Reptile extends Animal{
	public Reptile(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private boolean laysEggs;
	
	public boolean getLaysEggs() {
		return laysEggs;
	}
	
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs=laysEggs;
	}
	
}
