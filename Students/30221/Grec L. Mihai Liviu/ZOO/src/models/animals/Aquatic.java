package models.animals;

public abstract class Aquatic extends Animal{
	private Integer avgSwimDepth;
	private WaterType waterType;
	protected Aquatic(Double maintenanceCost , Double dangerPerc) {
		super(maintenanceCost , dangerPerc);
	}
	public Integer getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public WaterType getWaterType(){
		return waterType;
	}
	public void setAvgSwimDepth(Integer avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public void setWaterType(WaterType waterType){
		this.waterType = waterType;
	}
}
