package javasmmr.zoowsome.models.animals;


public class Salmon extends Aquatic {
	
	public Salmon (int nrOfLegs, String name, int avgSwimDepth,WaterType waterType, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Salmon(){
		super(2.1, 0.1);
		setNrOfLegs(0);
		setName("Salmon");
		setAvgSwimDepth(100);
		setWaterType(WaterType.SALTWATER);
	}
	
}
