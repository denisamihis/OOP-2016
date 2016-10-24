package animals;

import animals.Aquatic.wType;

public class Shark extends Aquatic {
	public Shark() {
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(wType.Saltwater);
	}
	
	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, wType waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
