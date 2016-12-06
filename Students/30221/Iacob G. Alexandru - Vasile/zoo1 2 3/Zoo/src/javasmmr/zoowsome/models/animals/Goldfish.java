package javasmmr.zoowsome.models.animals;

public class Goldfish extends Aquatic {
	public Goldfish () {
		super(0.0,0.3);
		this.setName("Goldy");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(100);
		this.setWaterType(waterType.Freshwater);
		
	}
	public Goldfish (String name, int nrOfLegs, int avgSwimDepth, waterType water,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(water);
		
	}
}
