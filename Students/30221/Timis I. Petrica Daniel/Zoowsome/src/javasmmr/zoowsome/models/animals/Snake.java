package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Snake extends Reptile {

	public Snake(Integer nrOfLegs, String name, boolean layEggs, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Snake() {
		super(4.1, 0.4);
		setNrOfLegs(0);
		setName("Snake");
		setLayEggs(true);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition() {
		Date currentDate = new Date();
		if (currentDate.getMonth() >= 5 && currentDate.getMonth() <= 8) {
			return 0.1;
		}
		return 0.0;
	}
	
	/*
	 * If the date is between June and September, the chances of being killed by
	 * the snake are bigger with 10%.
	 */
	
}
