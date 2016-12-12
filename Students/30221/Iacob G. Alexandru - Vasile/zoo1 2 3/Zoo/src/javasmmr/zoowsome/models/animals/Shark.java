package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark () {
		super(1.0,7.6);
		this.setName("Tooth");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(350);
		this.setWaterType(waterType.Saltwater);
		
	}
	public Shark (String name, int nrOfLegs, int avgSwimDepth, waterType water,double dangPerc, double maintenanceCost) {
		super(dangPerc, maintenanceCost);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(water);
		
	}
}
