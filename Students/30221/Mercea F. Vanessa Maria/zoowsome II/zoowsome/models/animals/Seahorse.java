package animals;

public class Seahorse extends Aquatic {
	public Seahorse() {
		super(3.0,0.0001);
		setNrOfLegs(0);
		setName("Seahorse");
		setAvgSwimDepth(200);
		setWaterType(wType.Saltwater);
	}
	
	public Seahorse(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer avgSwimDepth, wType waterType) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
