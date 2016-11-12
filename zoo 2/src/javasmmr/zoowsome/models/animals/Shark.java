package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Shark extends Aquatic {

	public Shark (String name, int depth,WaterType waterType,double cost,double danger){
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(waterType);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Shark(){
		this.setName("Shark");
		this.setAvgSwimDepth(2000);
		this.setWaterType(WaterType.saltWater);
		this.setdangerPerc(0.89);
		this.setMaintenanceCost(1.4);
	}
	
	@Override
	public boolean kill() {
		double chanceToKill;
		Random rand=new Random();
		chanceToKill=(rand.nextInt(10)+1)/10 ;
		
		if(chanceToKill >= this.getdangerPerc())
			return false;
		
		return true;
	}
}
