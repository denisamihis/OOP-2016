package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	public Whale(){
		setNrOfLegs(0);
		setName("Whale");
		setAvgSwimDepth(2500);
		setWaterType(Water.SALTWATER);
	}
	
	public Whale(Integer nrOfLegs,String name,Integer avgSwimDepth, Water waterType){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
