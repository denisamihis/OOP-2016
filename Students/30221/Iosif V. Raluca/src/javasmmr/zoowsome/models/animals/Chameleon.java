package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Chameleon extends Reptile {
	
	public Chameleon (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}

	public Chameleon(){
		this.setName("chameleon");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
		this.setMaintenanceCost(2.1);
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
