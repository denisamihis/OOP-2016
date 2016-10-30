package models.animals;

import java.util.Calendar;

public class Eagle extends Bird{
	public Eagle(){
		super(3.9 , 0.24);
		setNrOfLegs(2);
		setName("Eagle");
		setMigrates(true);
		setAvgFlightAltitude(3000);
	}
	public Eagle(Integer nrOfLegs , String name , boolean migrates , Integer avgFlightAltitude){
		super(3.9 , 0.24);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.HOUR_OF_DAY)>=22 && date.get(Calendar.HOUR_OF_DAY) <=6)
			return 0.26;
		return 0;
	}
}
