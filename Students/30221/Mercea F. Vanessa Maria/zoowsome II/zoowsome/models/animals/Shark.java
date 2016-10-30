package animals;

import animals.Aquatic.wType;

public class Shark extends Aquatic {
	public Shark() {
		super(4.0,0.0009);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(wType.Saltwater);
	}
	
	public Shark(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer avgSwimDepth, wType waterType) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
