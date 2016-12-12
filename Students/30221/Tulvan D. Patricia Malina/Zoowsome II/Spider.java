package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Spider extends Insect {
	public Spider(){
		super(2.1,0.5);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(Boolean.FALSE);
		setIsDangerous(Boolean.TRUE);
	}
	
	public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	@SuppressWarnings("deprecation")
	public double getPredisposition(){
		Date date= new Date();
		if(date.getHours()>=23 && date.getHours()<=6)
			return 0.25;
		return 0.0;
	}
	/**
	 * 
	 */
}
