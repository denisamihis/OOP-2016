package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Butterfly extends Insect {
	
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}
	
	public Butterfly(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Butterfly(){
		this.setName("Butterfly");
		this.setNrOfLegs(6);
		this.setCanFLy(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(1.0);
		this.setDangerPerc(0);
	}
	

}
