package javasmmr.zoowsome.models.animals;
import java.util.Random;

import javasmmr.zoowsome.models.animals.WaterType;


public class Dolphin extends Aquatic {
	
	public Dolphin (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	WaterType water;
	public Dolphin(){
		this.setName("Dolphin");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(200);
		this.setMaintenanceCost(5.2);
		this.setWaterType(WaterType.SALTWATER);
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
