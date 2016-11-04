package javasmmr.zoowsome.models.animals;

public class Seahorse extends Aquatic {
	
	public Seahorse(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Seahorse() {
		super(5.6, 0.0);
		setNrOfLegs(0);
		setName("Seahorse");
		setAvgSwimDepth(50);
		setWaterType(WaterType.SALTWATER);
	}

}
