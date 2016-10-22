package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	 public Octopus(String name, int depth, WaterType waterType){
		 this.setName(name);
		 this.setAvgSwimDepth(depth);
		 this.setWaterType(waterType);
	 }
	 
	 public Octopus(){
		 this.setName("Octopus");
		 this.setAvgSwimDepth(200);
		 this.setWaterType(WaterType.saltWater);
	 }
	
}
