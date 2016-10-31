package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Lizard extends Reptile {
	
	public Lizard(String name, boolean egg,double cost,double danger){
		
		this.setName(name);
		this.setLayEggs(egg);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Lizard(){
		
		this.setName("Lizard");
		this.setLayEggs(true);
		this.setdangerPerc(0.45);
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
