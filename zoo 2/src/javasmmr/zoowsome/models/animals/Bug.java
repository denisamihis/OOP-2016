package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Bug extends Insect {
	
	public Bug(String name, boolean fly,boolean dangerous,double cost,double danger){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}
	
	public Bug(){
		this.setName("Bug");
		this.setCanFly(false);
		this.setIsDangerous(false);
		this.setdangerPerc(0.1);
		this.setMaintenanceCost(0.3);
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
