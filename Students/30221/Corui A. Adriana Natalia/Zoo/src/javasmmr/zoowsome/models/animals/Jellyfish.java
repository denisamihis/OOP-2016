package javasmmr.zoowsome.models.animals;

public class Jellyfish extends Aquatic{

	public Jellyfish(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(5);
		super.setWaterType(WaterType.freshwater);
		super.setName("jellyfish");	
	}
}
