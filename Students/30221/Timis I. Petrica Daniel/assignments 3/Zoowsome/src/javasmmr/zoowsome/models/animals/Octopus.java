package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	public Octopus(int nrOfLegs, String name, int avgSwimDepth, Water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Octopus() {
		setNrOfLegs(6);
		setName("Octopus");
		setAvgSwimDepth(2100);
		setWaterType(Water.SALTWATER);
	}
	
}
