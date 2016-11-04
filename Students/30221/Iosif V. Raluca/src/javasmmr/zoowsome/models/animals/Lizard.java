package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Lizard extends Reptile {

	public Lizard (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Lizard(){
		this.setName("lizard");
		this.setNrOfLegs(4);
		this.setLaysEggs(false);
		this.setMaintenanceCost(3.0);
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
