package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dolphin extends Aquatic {
	
	public Dolphin()
	{
		this("DOLPHIN",50,"Salted Waters and Fresh Waters",5.0,0.0);
	}
	
	public Dolphin(String name,int value, String waterType, Double maintCost, double dangerPerc)
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
		if(theTime.compareTo("08:00")>0 && theTime.compareTo("14:00")<0)
		{
			thePredisposition = 0.0; // remains the same as the initial dangerPerc...dolphins are harmless.
		}
		return thePredisposition;
	}
}