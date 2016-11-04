package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Monkey extends Mammal{
		
	public Monkey(int legs, String name){
		this.setNrOfLegs(legs);
		this.setName(name);
		
	}
	public Monkey(){
		this.setNrOfLegs(4);
		this.setName("Monkey");
		this.setMaintenanceCost(3.0);
		this.setNormalBodyTemp(32);
		this.setPercBodyHair(90);
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
