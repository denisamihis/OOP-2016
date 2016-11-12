package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Snake extends Reptile {
	
	public Snake(String name, boolean egg,double cost,double danger){
		
		this.setName(name);
		this.setLayEggs(egg);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Snake(){
		
		this.setName("Snake");
		this.setLayEggs(true);
		this.setdangerPerc(0.78);
		this.setMaintenanceCost(0.5);
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
