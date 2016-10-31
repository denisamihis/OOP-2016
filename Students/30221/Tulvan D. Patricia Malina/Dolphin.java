package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(){
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(45);
		setWaterType(Water.SALTWATER);
	}
	
	public Dolphin(Integer nrOfLegs,String name,Integer avgSwimDepth, Water waterType){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
