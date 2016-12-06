package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	public enum waterType { 
		Saltwater, Freshwater
	}
	private waterType water;

	public Aquatic(double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
	}
	public Aquatic() {
		super();
	}
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public waterType getWaterType () {
		return water;
	}
	 public void setWaterType(waterType water) {
		 this.water = water;
	 }
}
