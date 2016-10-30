package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception 
	{
		if(Constants.Animals.Mammals.Tiger.equals(type))
			return new Tiger(7.8,0.8);
		else
			if(Constants.Animals.Mammals.Cow.equals(type))
				return new Cow(7.2,0.2);
			else
				if(Constants.Animals.Mammals.Monkey.equals(type))
					return new Monkey(6.1,0.2);
				else
					System.out.println("Invalid animal exception");
		throw new Exception("Invalid animal provided.");
	}
}
