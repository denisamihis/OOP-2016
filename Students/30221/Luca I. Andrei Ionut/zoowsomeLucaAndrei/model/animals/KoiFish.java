package animals;


public class KoiFish extends Aquatic {
	public KoiFish() {
		super(2.0, 0.00);
		setNrOfLegs(0);
		setName("KoiFish");
		setAvgSwimDepth(100);
		setWaterType(watType.Saltwater);
	}

	public KoiFish(Integer nrOfLegs, String name, Integer avgSwimDepth, watType waterType, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
