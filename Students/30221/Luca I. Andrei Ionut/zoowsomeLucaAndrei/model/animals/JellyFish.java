package animals;

public class JellyFish extends Aquatic {
	public JellyFish() {
		super(2.0, 0.01);
		setNrOfLegs(0);
		setName("JellyFish");
		setAvgSwimDepth(300);
		setWaterType(watType.Saltwater);
	}

	public JellyFish(Integer nrOfLegs, String name, Integer avgSwimDepth, watType waterType, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}