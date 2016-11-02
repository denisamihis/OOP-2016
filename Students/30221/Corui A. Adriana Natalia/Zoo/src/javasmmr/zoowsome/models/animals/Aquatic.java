package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal{

	public Aquatic(double maintCosts,double precDanger) {
		super(maintCosts, precDanger);
		// TODO Auto-generated constructor stub
	}
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
