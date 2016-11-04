package javasmmr.zoowsome.models.animals;

import java.util.*;

public class Tiger extends Mammal {
	
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Tiger() {
		super(3.9, 0.4);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.5f);
		setPercBodyHair(92.2f);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition() {
		Date currentDate = new Date();
		if (currentDate.getHours() >= 12 && currentDate.getHours() < 18) {
			return 0.1;
		}
		return 0.0;
	}
	
	/* 
	 * If the time is between 12:00 and 18:00 the chances of being killed
	 * by the tiger are bigger with 10%.
	 */

}
