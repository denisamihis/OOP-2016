
package models.animals;

abstract class Aquatic extends Animal{
	int avgSwimDepth;
	water waterType; 
	
	protected Aquatic(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public void setWaterType(water waterType){
		this.waterType = waterType;
	}
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public water getWaterType(){
		return waterType;
	}
}