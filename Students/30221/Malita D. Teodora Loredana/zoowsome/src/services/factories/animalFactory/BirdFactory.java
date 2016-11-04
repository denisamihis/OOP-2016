package services.factories.animalFactory;

import models.animlas.Animal;
import models.animlas.Dove;
import models.animlas.Eagle;
import models.animlas.Flamingo;
import services.factories.animalFactory.Constants.Animals;
import services.factories.animalFactory.Constants.Animals.Birds;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException{
		if (Constants.Animals.Birds.Flamingo.equals(type)) 
			return new Flamingo(); 
		else if (Constants.Animals.Birds.Dove.equals(type)) 	
			return new Dove();
		else if (Constants.Animals.Birds.Eagle.equals(type))
			return new Eagle();
		else 
			throw new InvalidSpeciesException(type);
	}

}
