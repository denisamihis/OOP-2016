package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Spider extends Insect {
	
	public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Spider() {
		super(1.7, 0.2);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition() {
		Date currentDate = new Date();
		if(currentDate.getHours() >= 23 || currentDate.getHours() < 6) {
			return 0.15;
		}
		return 0.0;
	}
	
	/* 
	 * If the time is between 23:00 and 6:00 the chances of being killed
	 * by the spider are bigger with 15%.
	 */

}
