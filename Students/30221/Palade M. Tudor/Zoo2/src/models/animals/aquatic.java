package models.animals;

public abstract class aquatic extends animals{
	private int avgSwimDepth;
	private water waterType;
	
	protected aquatic(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setAvgSwimDepth(int depth){
		avgSwimDepth = depth;
	}
	public void setWaterType(water type){
		waterType = type;
	}
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public water getWaterType(){
		return waterType;
	}
}