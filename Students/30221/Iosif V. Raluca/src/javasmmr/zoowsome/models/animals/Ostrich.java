package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Ostrich extends Bird {

	public Ostrich(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Ostrich(){
		this.setName("ostrich");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(0);
		this.setMaintenanceCost(4.5);
		this.setMigrates(false);
		this.setDangerPerc(0.2);

	}
	
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}
}
