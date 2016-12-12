package javasmmr.zoowsome.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dinosaur extends Reptile {
	
	public Dinosaur()
	{
		this("DINOSAUR",true,8.0,0.8);
	}
	
	public Dinosaur(String name, boolean answer, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(4);
		this.setName(name);
		this.setLayingEggs(answer);
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
		if(theTime.compareTo("09:00")>0 && theTime.compareTo("18:30")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
}