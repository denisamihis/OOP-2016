package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	private Integer avgSwimDepth;
	
	private Water waterType;
	
	public Integer getAvgSwimDepth(){
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth){
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public Water getWaterType(){
		return waterType;
	}
	
	public void setWaterType(Water waterType){
		this.waterType=waterType;
	}
}
