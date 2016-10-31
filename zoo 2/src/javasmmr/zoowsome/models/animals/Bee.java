package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Bee extends Insect {
	
	public Bee(String name, boolean fly,boolean dangerous,double cost,double danger){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
		
	}
	
	public Bee(){
		this.setName("Bee");
		this.setCanFly(true);
		this.setIsDangerous(true);
		this.setdangerPerc(0.5);
		this.setMaintenanceCost(0.4);
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
