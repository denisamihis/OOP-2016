package javasmmr.zoowsome.models;

public abstract class Aquatic extends Animal {
	
	private int avgSwimDepth;
	private String waterType;
	
	public int getAvgSwimDepth()
	{
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int value)
	{
		avgSwimDepth = value;
	}
	
	public String getWaterType()
	{
		return waterType;
	}
	
	public void setWaterType(String newType)
	{
		waterType = newType;
	}
}