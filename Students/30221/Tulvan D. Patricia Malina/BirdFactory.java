package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Chicken;

public class BirdFactory extends SpeciesFactory{
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Birds.Owl.equals(type))
			return new Owl();
		else
			if(Constants.Animals.Birds.Eagle.equals(type))
				return new Eagle();
			else
				if(Constants.Animals.Birds.Chicken.equals(type))
					return new Chicken();
				else 
					throw new Exception("Invalid animal exception!");	
	}
	
}
