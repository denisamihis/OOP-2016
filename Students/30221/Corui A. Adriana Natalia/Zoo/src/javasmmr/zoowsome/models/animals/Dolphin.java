package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	
	public Dolphin(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(20);
		super.setWaterType(WaterType.saltwater);
		super.setName("dolphin");	
	}
	
}
