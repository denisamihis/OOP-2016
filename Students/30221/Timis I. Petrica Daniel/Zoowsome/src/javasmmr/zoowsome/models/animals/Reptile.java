package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {

	private boolean layEggs;
	
	public Reptile(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public boolean getLayEggs() {
		return layEggs;
	}
	
	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	
}
