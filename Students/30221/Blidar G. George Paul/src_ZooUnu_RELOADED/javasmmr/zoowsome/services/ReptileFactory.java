package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.*;

public class ReptileFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Reptiles.Snake.equals(type))
		{
			return new Snake(Constants.Animals.Reptiles.Snake,true);
		}
		else if(Constants.Animals.Reptiles.Aligator.equals(type))
		{
			return new Aligator(Constants.Animals.Reptiles.Aligator,true);
		}
		else if(Constants.Animals.Reptiles.Dinosaur.equals(type))
		{
			return new Dinosaur(Constants.Animals.Reptiles.Dinosaur,true);
		}
		else
		{
			return null;
		}
	}
}