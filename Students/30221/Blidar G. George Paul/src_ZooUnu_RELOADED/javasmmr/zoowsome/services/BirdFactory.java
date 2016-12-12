package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.*;

public class BirdFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Birds.Eagle.equals(type))
		{
			return new Eagle(Constants.Animals.Birds.Eagle,true,100);
		}
		else if(Constants.Animals.Birds.Flamingo.equals(type))
		{
			return new Flamingo(Constants.Animals.Birds.Flamingo,false,0);
		}
		else if(Constants.Animals.Birds.Pelican.equals(type))
		{
			return new Pelican(Constants.Animals.Birds.Pelican,true,10);
		}
		else
		{
			return null;
		}
	}
}