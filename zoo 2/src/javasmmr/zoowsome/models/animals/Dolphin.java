package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Dolphin extends Aquatic {
	
	public Dolphin (String name, int depth,WaterType waterType,double cost,double danger){
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(waterType);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Dolphin (){
	
	    this.setName("Dolphin");
		this.setAvgSwimDepth(750);
		this.setWaterType(WaterType.saltWater);
		this.setdangerPerc(0.0);
		this.setMaintenanceCost(1.2);
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
