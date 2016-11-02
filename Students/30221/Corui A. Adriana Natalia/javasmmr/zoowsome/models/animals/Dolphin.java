package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	
	public Dolphin()
	{
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(20);
		super.setWaterType(WaterType.saltwater);
		super.setName("dolphin");	
	}
	
}
