package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Parrot extends Bird {
	
	public Parrot (String name,boolean migrate, int altitude,double cost,double danger){
		
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setMigrtaes(migrate);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Parrot(){
		this.setName("Parrot");
		this.setAvgFligthAltitude(200);
		this.setMigrtaes(false);
		this.setdangerPerc(0.1);
		this.setMaintenanceCost(2.0);
	}
	
	@Override
	public boolean kill() {
		double chanceToKill;
		Random rand=new Random();
		chanceToKill=(rand.nextInt(10)+1)/10 ;
		
		if(chanceToKill >= this.getdangerPerc())
			return false;
		
		return true;
	}

}
