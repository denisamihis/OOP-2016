package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public Shark()
	{
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(50);
		super.setWaterType(WaterType.saltwater);
		super.setName("shark");	
	}
}
