package javasmmr.zoowsome.models.animals;

public class Jellyfish extends Aquatic{

	public Jellyfish()
	{
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(5);
		super.setWaterType(WaterType.freshwater);
		super.setName("jellyfish");	
	}
}
