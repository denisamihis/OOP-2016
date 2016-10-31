package javasmmr.zoowsome.models;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Aligator extends Reptile {
	
	public Aligator()
	{
		this("ALIGATOR",true,2.7,0.5);
	}
	
	public Aligator(String name, boolean answer, Double maintCost, double dangerPerc)
	{
		super(maintCost,dangerPerc);
		this.setNumberOfLegs(4);
		this.setLayingEggs(answer);
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
		if(theTime.compareTo("08:00")>0 && theTime.compareTo("13:00")<0)
		{
			thePredisposition = 0.0;
		}
		return thePredisposition;
	}
}
