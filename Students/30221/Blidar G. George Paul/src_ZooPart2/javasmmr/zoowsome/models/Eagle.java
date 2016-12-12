package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Eagle extends Bird {
	
	public Eagle()
	{
		this("EAGLE",true,100,5.5,0.0);
	}
	
	public Eagle(String name, boolean answer, int altitude, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsMigrating(answer);
		this.setAvgFlightAltitude(altitude);
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
		if(theTime.compareTo("08:00")>0 && theTime.compareTo("13:00")<0)
		{
			thePredisposition = 0.0; // remains the same...eagles are harmless
		}
		return thePredisposition;
	}
}