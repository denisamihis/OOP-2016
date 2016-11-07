package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Vulture extends Bird {
	
	public Vulture (int nrOfLegs, String name, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Vulture (){
		super(2.7, 0.3);
		setNrOfLegs(2);
		setName("Vulture");
		setMigrates(false);
		setAvgFlightAltitude(6000);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition(){
		Date currentDate = new Date();
		if (currentDate.getMonth() == 5) {
			return 0.1;
		}
		return 0.0;
	}
	
	

}
