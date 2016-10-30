package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Wasp extends Insect {
	
	
	public Wasp()
	{
		this("WASP",true,true,1.2,0.1);
	}
	
	public Wasp(String name, boolean answer1, boolean answer2, Double maintCost, double dangerPerc)
	{
		super(maintCost,0.1);
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsFlying(answer1);
		this.setItIsDangerous(answer2);
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
		if(theTime.compareTo("07:00")>0 && theTime.compareTo("14:30")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
	
}