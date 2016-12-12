package javasmmr.zoowsome.models.animals;


public class Whale extends Aquatic{
	
	public Whale (int nrOfLegs, String name, int avgSwimDepth,WaterType waterType, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Whale(){
		super(4.5, 0.4);
		setNrOfLegs(0);
		setName("Whale");
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}
	

}
