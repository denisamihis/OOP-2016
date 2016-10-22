package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	
	public Dolphin (String name, int depth,WaterType waterType){
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(waterType);
	}
	
	public Dolphin (){
	
	    this.setName("Dolphin");
		this.setAvgSwimDepth(750);
		this.setWaterType(WaterType.saltWater);
	}
	
} 
