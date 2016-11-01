package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	
	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Integer avgSwimDepth;
	
	private WaterType waterType;
	
	public Integer getAvgSwimDepth(){
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth){
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public WaterType getWaterType(){
		return waterType;
	}
	
	public void setWaterType(WaterType waterType){
		this.waterType=waterType;
	}
}
