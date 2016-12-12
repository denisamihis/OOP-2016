package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(){
		super(4.6,0.0);
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(45);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Dolphin(Integer nrOfLegs,String name,Integer avgSwimDepth, WaterType waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
