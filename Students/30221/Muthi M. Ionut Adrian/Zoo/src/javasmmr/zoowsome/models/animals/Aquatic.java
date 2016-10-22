package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private WaterType waterType;
	
	
	
	public WaterType getWaterType(){
		
		return waterType;
	}
	
	public void setWaterType(WaterType waterType){
		
		this.waterType=waterType;
	}
	
	public int getAvgSwimDepth(){
		
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth( int depth){
		
	 avgSwimDepth=depth;
	 
	}

}
