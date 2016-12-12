package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark (String name, int depth,WaterType waterType){
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(waterType);
	}
	
	public Shark(){
		this.setName("Shark");
		this.setAvgSwimDepth(2000);
		this.setWaterType(WaterType.saltWater);
	}
}
