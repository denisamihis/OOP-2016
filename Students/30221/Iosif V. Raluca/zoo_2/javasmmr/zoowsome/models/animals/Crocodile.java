package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Crocodile  extends Reptile{

	public Crocodile(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Crocodile(){
		this.setName("crocodile");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
		this.setMaintenanceCost(6.3);
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
