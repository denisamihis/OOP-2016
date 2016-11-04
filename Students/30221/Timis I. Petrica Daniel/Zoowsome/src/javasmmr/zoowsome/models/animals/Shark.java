package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Shark extends Aquatic {
	
	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Shark() {
		super(5.5, 0.6);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2500);
		setWaterType(WaterType.SALTWATER);
	}

	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition() {
		Date currentDate = new Date();
		if (currentDate.getHours() >= 9 && currentDate.getHours() < 15) {
			return 0.1;
		}
		return 0.0;
	}
	
	/* 
	 * If the time is between 9:00 and 15:00 the chances of being killed
	 * by the shark are bigger with 10%.
	 */
	
}
