package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory{

	public Animal getAnimal(String type)
	{
		if(Constants.Animals.Insects.Butterfly.equals(type))
			return new Butterfly();
		else
			if(Constants.Animals.Insects.Cockroach.equals(type))
				return new Cockroach();
			else
				if(Constants.Animals.Insects.Spider.equals(type))
					return new Spider();
				else
					System.out.println("Invalid animal exception");
		return null;
	}
}
