package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cow extends Mammal{
	
	public Cow( int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	public Cow(){
		this.setName("Cow");
		this.setNrOfLegs(4);
		this.setMaintenanceCost(5.0);
		this.setNormalBodyTemp(32);
		this.setPercBodyHair(75);
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
