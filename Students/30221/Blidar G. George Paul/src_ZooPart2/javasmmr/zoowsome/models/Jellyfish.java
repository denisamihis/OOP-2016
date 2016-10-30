package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jellyfish extends Aquatic {
	
	public Jellyfish()
	{
		this("JELLYFISH",15,"Salted Waters",3.5,0.35);
	}
	
	public Jellyfish(String name,int value, String waterType, Double maintCost, double dangerPerc)
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
		double thePredispositionOfAnimal = this.getPredisposition();
		if(randomNumber < thePredispositionOfAnimal)
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
		if(theTime.compareTo("10:00")>0 && theTime.compareTo("17:30")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
}