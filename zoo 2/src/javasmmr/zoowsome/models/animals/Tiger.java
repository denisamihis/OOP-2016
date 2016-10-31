package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tiger extends Mammal{
	
	public Tiger(String name, int legs, float temp,float hair,double cost,double danger){
		this.setName(name);
		this.setNrOfLegs(legs);
		this.setNormalBodyTemp(temp);
		this.setPrecBodyHair(hair);
		this.setdangerPerc(danger);
		this.setMaintenanceCost(cost);
	}

	public Tiger(){	
		
		this.setName("Tiger");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 37.5);
		this.setPrecBodyHair((float) 100);
		this.setdangerPerc(0.91);
		this.setMaintenanceCost(2.3);
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
