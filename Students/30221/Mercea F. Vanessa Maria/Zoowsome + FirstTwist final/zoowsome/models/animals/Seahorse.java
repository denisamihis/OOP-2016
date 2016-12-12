package animals;

public class Seahorse extends Aquatic {
	public Seahorse() {
		setNrOfLegs(0);
		setName("Seahorse");
		setAvgSwimDepth(200);
		setWaterType(wType.Saltwater);
	}
	
	public Seahorse(Integer nrOfLegs, String name, Integer avgSwimDepth, wType waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
