package javasmmr.zoowsome.models.animals;

//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javasmmr.zoowsome.models.animals.Interface.Killer;

abstract public class Animal implements Killer {
	
	private String name;
	private int nrOfLegs;
	final double maintCosts;
	final double precDanger;
	private boolean takenCareOf=false;
	public Animal(double maintCosts,double precDanger)
	{
		this.maintCosts=maintCosts;
		this.precDanger=precDanger;
	}
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf)
	{
		this.takenCareOf=takenCareOf;
	}
	public int getNrOfLegs()
	{
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs=nrOfLegs;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getMaintCosts()
	{
		return maintCosts;
	}
	@Override
	public boolean kill()
	{
		/*Random rand=new Random();
		double randNr=rand.nextDouble();*/
		double randNr = ThreadLocalRandom.current().nextDouble(0,1);
		if(randNr < precDanger)
			return true;
		return false;
	}
}
