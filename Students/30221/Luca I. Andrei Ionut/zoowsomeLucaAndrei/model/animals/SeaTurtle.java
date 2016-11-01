package animals;

public class SeaTurtle extends Aquatic {
	public SeaTurtle() {
		super(2.0, 0.00);
		setNrOfLegs(2);
		setName("SeaTurtle");
		setAvgSwimDepth(80);
		setWaterType(watType.Saltwater);
	}

	public SeaTurtle(Integer nrOfLegs, String name, Integer avgSwimDepth, watType waterType, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
