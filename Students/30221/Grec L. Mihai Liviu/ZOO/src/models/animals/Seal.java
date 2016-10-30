package models.animals;

import java.util.Calendar;

public class Seal extends Aquatic{
	public Seal(){
		super(7.1 , 0.07);
		setNrOfLegs(0);
		setName("Seal");
		setAvgSwimDepth(40);
		setWaterType(WaterType.FRESHWATER);
	}
	public Seal(Integer nrOfLegs , String name , Integer avgSwimDepth , WaterType waterType){
		super(7.6 , 0.07);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH)>=Calendar.MAY && date.get(Calendar.MONTH)<=Calendar.SEPTEMBER)
			return 0.12;
		return 0;
	}
}
