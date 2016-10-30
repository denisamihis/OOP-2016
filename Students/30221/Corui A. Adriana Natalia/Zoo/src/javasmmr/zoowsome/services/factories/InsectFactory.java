package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception
	{
		if(Constants.Animals.Insects.Butterfly.equals(type))
			return new Butterfly(0.3,0.1);
		else
			if(Constants.Animals.Insects.Cockroach.equals(type))
				return new Cockroach(0.1,0.6);
			else
				if(Constants.Animals.Insects.Spider.equals(type))
					return new Spider(0.7,0.9);
				else
					System.out.println("Invalid animal exception");
		throw new Exception("Invalid animal provided.");
	}
}
