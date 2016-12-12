package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Shark extends Aquatic {

	public Shark()
	{
		this("SHARK",100,"Salted Waters",1.5,0.9);
	}
	
	public Shark(String name, int value, String waterType, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(0);
		this.setName(name);
		this.setAvgSwimDepth(value);
		this.setWaterType(waterType);
	}
	
	public boolean kill()
	{
		double randomNumber = Math.random();
		double predispositionOfAnimal = this.getPredisposition();
		if(randomNumber < predispositionOfAnimal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getPredisposition()
	{
		String theTime = new SimpleDateFormat("HH:mm").format(new Date());
		double thePredisposition = this.dangerPercentage;
		if(theTime.compareTo("10:00")>0 && theTime.compareTo("19:00")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
}
	