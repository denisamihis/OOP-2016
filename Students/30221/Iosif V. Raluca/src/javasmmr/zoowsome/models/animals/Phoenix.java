package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Phoenix extends Bird {

	public Phoenix (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Phoenix(){
		this.setName("phoenix");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(50);
		this.setMaintenanceCost(5.3);
		this.setMigrates(false);
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
