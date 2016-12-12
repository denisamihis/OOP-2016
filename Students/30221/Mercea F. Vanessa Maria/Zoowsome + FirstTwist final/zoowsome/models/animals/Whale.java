package animals;

import animals.Aquatic.wType;

public class Whale extends Aquatic {
	public Whale() {
		setNrOfLegs(0);
		setName("Whale");
		setAvgSwimDepth(1000);
		setWaterType(wType.Saltwater);
	}
	
	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, wType waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
