package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	protected int avgSwimDepth;
	
	
	
	public enum Watert{
		Saltwater, Freshwater;
	}
	public Watert waterType;
	public void setAvgSwimDepth(int average){
		this.avgSwimDepth=average;
	}
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}

	public void setWaterType(Watert waterType){
		this.waterType=waterType;
	}
	
	public Watert getWaterType(){
		return waterType;
	}
}
