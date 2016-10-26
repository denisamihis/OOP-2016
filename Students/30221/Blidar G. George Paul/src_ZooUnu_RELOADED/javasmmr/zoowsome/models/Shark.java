package javasmmr.zoowsome.models;

public class Shark extends Aquatic {

	public Shark()
	{
		this("SHARK",100,"Salted Waters");
	}
	
	public Shark(String name, int value, String waterType)
	{
		this.setNumberOfLegs(0);
		this.setName(name);
		this.setAvgSwimDepth(value);
		this.setWaterType(waterType);
	}
}