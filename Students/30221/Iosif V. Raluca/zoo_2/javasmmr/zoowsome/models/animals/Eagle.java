package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Eagle extends Bird {
	
	public Eagle(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Eagle(){
		this.setName("eagle");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(200);
		this.setMaintenanceCost(7.0);
		this.setMigrates(false);
		this.setDangerPerc(0.1);
	}
	
	public boolean kill(){
		Random rand=new Random();
		int i=rand.nextInt(1);
		if (i<this.getDangerPerc()){
			return true;
		} else return false;
	}

}
