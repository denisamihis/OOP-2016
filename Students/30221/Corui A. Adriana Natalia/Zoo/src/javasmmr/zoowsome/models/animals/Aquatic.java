package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal{

	private int avgSwimDepth;
	private WaterType waterType;
	public int getAvgSwimDepth()
	{
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth)
	{
		this.avgSwimDepth=avgSwimDepth;
	}
	public WaterType getWaterType()
	{
		return waterType;
	}
	public void setWaterType(WaterType waterType)
	{
		this.waterType=waterType;
	}
}
