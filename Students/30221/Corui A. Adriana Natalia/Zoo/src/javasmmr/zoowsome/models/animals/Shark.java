package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public Shark(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(50);
		super.setWaterType(WaterType.saltwater);
		super.setName("shark");	
	}
}
