package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tucan extends Bird {
	
	public Tucan(String name,boolean migrate, int altitude,double cost,double danger){
		
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setMigrtaes(migrate);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Tucan(){
		this.setName("Tucan");
		this.setAvgFligthAltitude(300);
		this.setMigrtaes(false);
		this.setdangerPerc(0.2);
		this.setMaintenanceCost(1.0);
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
