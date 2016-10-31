package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	
	private int avgSwimDepth;
	private Water waterType;
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Water getWaterType() {
		return waterType;
	}
	
	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}

}
