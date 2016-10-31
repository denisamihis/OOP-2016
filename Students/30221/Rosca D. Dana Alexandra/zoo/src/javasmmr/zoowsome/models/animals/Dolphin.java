package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(){
		 setNrLegs(0);
		 setName("Dolphin");
		 setAvgSwimDepth(54);
		 setWaterType(Water.SaltWater);
	}
	
	public Dolphin(Integer nrOfLegs,String name,Integer avgSwimDepth, Water waterType){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setAvgSwimDepth(avgSwimDepth);
		 setWaterType(waterType);
	}

}
