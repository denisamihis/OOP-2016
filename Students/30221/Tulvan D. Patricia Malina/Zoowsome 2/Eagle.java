package javasmmr.zoowsome.models.animals;

import java.util.Date;

public class Eagle extends Bird{
	public Eagle(){
		super(3.2,0.62);
		setNrOfLegs(2);
		setName("Eagle");
		setMigrates(Boolean.FALSE);
		setAvgFlightAltitude(10000);
	}
	
	public Eagle(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	@SuppressWarnings("deprecation")
	public double getPredisposition(){
		Date date= new Date();
		if(date.getHours()>=12 && date.getHours()<=16)
			return 0.15;
		return 0.0;
	}
}
