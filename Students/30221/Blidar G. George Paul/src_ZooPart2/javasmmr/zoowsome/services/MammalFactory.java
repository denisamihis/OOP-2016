package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.*;

public class MammalFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Mammals.Cow.equals(type))
		{
			return new Cow(Constants.Animals.Mammals.Cow,36,95,4.0,0.0);
		}
		else if(Constants.Animals.Mammals.Monkey.equals(type))
		{
			return new Monkey(Constants.Animals.Mammals.Monkey,36,90,5.0,0.0);
		}
		else if(Constants.Animals.Mammals.Tiger.equals(type))
		{
			return new Tiger(Constants.Animals.Mammals.Tiger,40,99,3.0,0.9);
		}
		else
		{
			return null;
		}
	}
}