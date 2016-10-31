package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tiger extends Mammal {
	
	public Tiger()
	{
		this("TIGER",40,99,3.0,0.9);
	}
	
	public Tiger(String name,float normallyTemp, float percentage, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(4);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
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
		if(theTime.compareTo("10:00")>0 && theTime.compareTo("15:00")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
}