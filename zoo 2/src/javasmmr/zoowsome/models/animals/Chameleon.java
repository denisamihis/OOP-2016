package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Chameleon extends Reptile {
	
	public Chameleon(String name, boolean egg,double cost,double danger){
		
		this.setName(name);
		this.setLayEggs(egg);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Chameleon(){
		
		this.setName("Chameleon");
		this.setLayEggs(true);
		this.setdangerPerc(0.0);
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
