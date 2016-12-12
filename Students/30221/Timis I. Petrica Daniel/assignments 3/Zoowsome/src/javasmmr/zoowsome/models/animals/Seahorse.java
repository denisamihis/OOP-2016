package javasmmr.zoowsome.models.animals;

public class Seahorse extends Aquatic {
	
	public Seahorse(int nrOfLegs, String name, int avgSwimDepth, Water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Seahorse() {
		setNrOfLegs(0);
		setName("Seahorse");
		setAvgSwimDepth(50);
		setWaterType(Water.SALTWATER);
	}

}
