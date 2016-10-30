package models.animals;

import java.util.Calendar;

public class Penguin extends Aquatic{
	public Penguin(){
		super(6.8 , 0.03);
		setNrOfLegs(2);
		setName("Penguin");
		setAvgSwimDepth(35);
		setWaterType(WaterType.FRESHWATER);
	}
	public Penguin(Integer nrOfLegs , String name , Integer avgSwimDepth , WaterType waterType){
		super(7.4 , 0.03);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH)>=Calendar.JUNE && date.get(Calendar.MONTH)<=Calendar.AUGUST)
			return 0.12;
		return 0;
	}
}
