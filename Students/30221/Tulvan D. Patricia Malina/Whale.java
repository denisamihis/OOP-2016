package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	public Whale(){
		super(5.5,0.1);
		setNrOfLegs(0);
		setName("Whale");
		setAvgSwimDepth(2500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(Integer nrOfLegs,String name,Integer avgSwimDepth, WaterType waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
