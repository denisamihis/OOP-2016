package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public Shark(){
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(Water.SALTWATER);
	}
	
	public Shark(Integer nrOfLegs,String name,Integer avgSwimDepth, Water waterType){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
