package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	protected int avgSwimDepth;
	protected enum Water {
		FRESHWATER, SALTWATER;
	}
	protected Water waterType;
	
	
	public int getAvgSwimDepth () {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth (int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Water getWaterType (Water waterType){
		return waterType;
		
	}
	public void setWaterType (Water waterType){
		this.waterType=waterType;
	}

}
