package models.animals;

import java.util.Calendar;

public class Peacock extends Bird{
	public Peacock(){
		super(1.9 , 0.05);
		setNrOfLegs(2);
		setName("Peacock");
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
	public Peacock(Integer nrOfLegs , String name , boolean migrates , Integer avgFlightAltitude){
		super(1.9 , 0.05);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
			return 0.06;
		return 0;
	}
}
