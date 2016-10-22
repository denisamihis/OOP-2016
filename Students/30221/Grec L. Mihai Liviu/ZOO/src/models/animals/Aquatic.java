package models.animals;

public abstract class Aquatic extends Animal{
	private int avgSwimDepth;
	private WaterType waterType;
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public WaterType getWaterType(){
		return waterType;
	}
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public void setWaterType(WaterType waterType){
		this.waterType = waterType;
	}
}
