package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	protected int avgSwimDepth;

	protected WaterType waterType;
	
	public Aquatic (double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public int getAvgSwimDepth () {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth (int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public WaterType getWaterType (WaterType waterType){
		return waterType;
		
	}
	public void setWaterType (WaterType waterType){
		this.waterType=waterType;
	}

}
