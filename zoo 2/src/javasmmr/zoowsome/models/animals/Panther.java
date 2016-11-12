package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Panther extends Mammal{
	
	public Panther(String name, int legs, float temp,float hair,double cost,double danger){
		this.setName(name);
		this.setNrOfLegs(legs);
		this.setNormalBodyTemp(temp);
		this.setPrecBodyHair(hair);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}

	public Panther(){	
		
		this.setName("Black Panter");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 35.5);
		this.setPrecBodyHair((float) 100);
		this.setdangerPerc(0.85);
		this.setMaintenanceCost(2.5);
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
