package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	
	public Shark(int nrOfLegs, String name, int avgSwimDepth, Water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Shark() {
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2500);
		setWaterType(Water.SALTWATER);
	}

}
