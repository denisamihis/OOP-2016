package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.*;

public class AquaticFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Aquatics.Shark.equals(type))
		{
			return new Shark(Constants.Animals.Aquatics.Shark,100,"Salted Waters");
		}
		else if(Constants.Animals.Aquatics.Dolphin.equals(type))
		{
			return new Dolphin(Constants.Animals.Aquatics.Dolphin,50,"Salted Waters and Fresh Waters");
		}
		else if(Constants.Animals.Aquatics.Jellyfish.equals(type))
		{
			return new Jellyfish(Constants.Animals.Aquatics.Jellyfish,15,"Salted Waters");
		}
		else
		{
			return null;
		}
	}
}