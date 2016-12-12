package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cockroach extends Insect {
	
	public Cockroach(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
		
	}
	
	public Cockroach(){
		this.setName("Cockroach");
		this.setNrOfLegs(6);
		this.setCanFLy(false);
		this.setIsDangerous(false);
		this.setMaintenanceCost(0.1);
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
