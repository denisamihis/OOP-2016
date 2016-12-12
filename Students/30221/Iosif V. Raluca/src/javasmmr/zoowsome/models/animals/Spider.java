package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Spider  extends Insect {
	public Spider(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Spider(){
		this.setName("Spider");
		this.setNrOfLegs(8);
		this.setCanFLy(false);
		this.setIsDangerous(true);
		this.setMaintenanceCost(3.2);
		this.setDangerPerc(0.5);

	}
	
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}
	
}
