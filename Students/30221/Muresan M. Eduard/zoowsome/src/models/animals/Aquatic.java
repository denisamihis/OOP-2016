package models.animals;

public abstract class Aquatic extends Animal{
	protected int avgSwimDepth;
	enum water{freshWater, saltWater};
	protected water waterType;
	Aquatic (int avgSwimDepth, water waterType, String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.waterType = waterType;
		this.avgSwimDepth = avgSwimDepth;
	}
	public int getAvgSwimDepth()
	{
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth)
	{
		this.avgSwimDepth = avgSwimDepth;
	}
	public water getWaterType()
	{
		return waterType;
	}
	public void setWaterType(water waterType)
	{
		this.waterType = waterType;
	}

}
