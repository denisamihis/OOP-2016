package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Vulture extends Bird {

	public Vulture(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Vulture() {
		super(2.1, 0.09);
		setNrOfLegs(2);
		setName("Vulture");
		setMigrates(true);
		setAvgFlightAltitude(11300);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition() {
		Date currentDate = new Date();
		if (currentDate.getMonth() == 5) {
			return 0.1;
		}
		return 0.0;
	}
	
	/* 
	 * If it's June the chances of being killed by the vulture are bigger
	 * with 10%.
	 */
}
