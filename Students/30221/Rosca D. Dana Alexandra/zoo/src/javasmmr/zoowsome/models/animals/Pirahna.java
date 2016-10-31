package javasmmr.zoowsome.models.animals;

public class Pirahna extends Aquatic{
	public Pirahna(){
		 setNrLegs(0);
		 setName("Pirahna");
		 setAvgSwimDepth(35);
		 setWaterType(Water.FreshWater);
	}
	public Pirahna(Integer nrOfLegs,String name,Integer avgSwimDepth, Water waterType){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setAvgSwimDepth(avgSwimDepth);
		 setWaterType(waterType);
		 }

}
