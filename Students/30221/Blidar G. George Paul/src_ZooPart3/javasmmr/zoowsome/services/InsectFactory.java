package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.*;

public class InsectFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Insects.Butterfly.equals(type))
		{
			return new Butterfly(Constants.Animals.Insects.Butterfly,true,false,0.5,0.0);
		}
		else if(Constants.Animals.Insects.Spider.equals(type))
		{
			return new Spider(Constants.Animals.Insects.Spider,false,true,1.0,0.7);
		}
		else if(Constants.Animals.Insects.Wasp.equals(type))
		{
			return new Wasp(Constants.Animals.Insects.Wasp,true,true,1.2,0.2);
		}
		else
		{
			return null;
		}
	}
}