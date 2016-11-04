package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tiger extends Mammal {
	
	public Tiger(int number, String name){
		this.setNrOfLegs(number);
		this.setName(name);
		
	}
	
	public Tiger(){
		this.setNrOfLegs(4);
		this.setName("Tiger");
		this.setMaintenanceCost(6.3);
		this.setNormalBodyTemp(26);
		this.setPercBodyHair(90);
		this.setDangerPerc(1);

	}
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}
	
}
