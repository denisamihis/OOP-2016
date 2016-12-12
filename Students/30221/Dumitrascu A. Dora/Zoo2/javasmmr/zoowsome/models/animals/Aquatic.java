package javasmmr.zoowsome.models.animals;

abstract class Aquatic extends Animal{
	
	public Aquatic(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
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
