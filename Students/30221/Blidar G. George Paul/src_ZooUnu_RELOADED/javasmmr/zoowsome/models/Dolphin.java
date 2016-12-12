package javasmmr.zoowsome.models;

public class Dolphin extends Aquatic {
	
	public Dolphin()
	{
		this("DOLPHIN",50,"Salted and Fresh Waters");
	}
	
	public Dolphin(String name,int value, String waterType)
	{
		this.setNumberOfLegs(0);
		this.setName(name);
		this.setAvgSwimDepth(value);
		this.setWaterType(waterType);
	}
}