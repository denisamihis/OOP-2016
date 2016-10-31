package javasmmr.zoowsome.models.animals;

public class Mermaid extends Aquatic{
	public Mermaid(){
		setNrLegs(0);
		 setName("Mermaid");
		 setAvgSwimDepth(43);
		 setWaterType(Water.FreshWater);
	}
	public Mermaid(Integer nrOfLegs,String name,Integer avgSwimDepth, Water waterType){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setAvgSwimDepth(avgSwimDepth);
		 setWaterType(waterType);
	}

}
