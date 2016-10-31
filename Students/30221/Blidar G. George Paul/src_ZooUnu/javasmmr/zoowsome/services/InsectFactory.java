package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.*;

public class InsectFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Insects.Butterfly.equals(type))
		{
			return new Butterfly(Constants.Animals.Insects.Butterfly,true,false);
		}
		else if(Constants.Animals.Insects.Spider.equals(type))
		{
			return new Spider(Constants.Animals.Insects.Spider,false,true);
		}
		else if(Constants.Animals.Insects.Wasp.equals(type))
		{
			return new Wasp(Constants.Animals.Insects.Wasp,true,true);
		}
		else
		{
			return null;
		}
	}
}