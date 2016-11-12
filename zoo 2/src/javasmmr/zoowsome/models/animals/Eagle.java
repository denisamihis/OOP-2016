package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Eagle extends Bird {
	
	public Eagle(String name,boolean migrate, int altitude,double cost,double danger){
	
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setMigrtaes(migrate);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Eagle(){
		this.setName("Eagle");
		this.setAvgFligthAltitude(12000);
		this.setMigrtaes(true);
		this.setdangerPerc(0.25);
		this.setMaintenanceCost(1.4);
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
