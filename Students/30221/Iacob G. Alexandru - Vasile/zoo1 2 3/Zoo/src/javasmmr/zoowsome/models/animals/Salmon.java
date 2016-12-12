package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic {
	public Salmon () {
		super(0.5,0.7);
		this.setName("Big Blue");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(234);
		this.setWaterType(waterType.Freshwater);
		
	}
	public Salmon (String name, int nrOfLegs, int avgSwimDepth, waterType water,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(water);
		
	}
}
