package javasmmr.zoowsome.models.animals;

abstract class Aquatic extends Animals{
	protected int avgSwimDepth;
	protected enum waterType{
		SALTWATER,FRESHWATER;
	}
	protected waterType type;
	
	public int getSwimDepth(){
		return avgSwimDepth;
	}
	
	public waterType getWaterType(){
		return type;
	}
	
	public void setSwimDepth(int avgSwimDepth){
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public void setWaterType(waterType type){
		this.type=type;
	}
	
}
