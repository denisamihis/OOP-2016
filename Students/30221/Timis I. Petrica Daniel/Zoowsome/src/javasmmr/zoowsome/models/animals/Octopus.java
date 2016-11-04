package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Octopus() {
		super(3.9, 0.12);
		setNrOfLegs(6);
		setName("Octopus");
		setAvgSwimDepth(2100);
		setWaterType(WaterType.SALTWATER);
	}
	
}
