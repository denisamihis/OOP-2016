package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tuna extends Aquatic {
	
	public Tuna(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Tuna(){
		this.setName("Tuna");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(30);
		this.setMaintenanceCost(2.2);
		this.setWaterType(WaterType.FRESHWATER);
		this.setDangerPerc(0);

	}
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}
}
