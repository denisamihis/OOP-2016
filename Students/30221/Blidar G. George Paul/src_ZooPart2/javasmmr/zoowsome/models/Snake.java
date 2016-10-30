package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Snake extends Reptile {
	
	public Snake()
	{
		this("SNAKE",true,6.5,0.8);
	}
	
	public Snake(String name, boolean answer, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(0);
		this.setName(name);
		this.setLayingEggs(answer);
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
		if(theTime.compareTo("06:00")>0 && theTime.compareTo("12:30")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
}