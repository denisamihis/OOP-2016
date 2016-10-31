package services.factories.animalFactory;

import models.animlas.Animal;
import models.animlas.Butterfly;
import models.animlas.Insect;
import models.animlas.Moschito;
import models.animlas.Spider;

public class InsectFactory extends SpeciesFactory {
	@Override
	public Insect getAnimal(String type)  throws InvalidSpeciesException{
		if (Constants.Animals.Insects.Butterfly.equals(type)) 
			return new Butterfly(); 
		else if (Constants.Animals.Insects.Moschito.equals(type)) 	
			return new Moschito();
		else if (Constants.Animals.Insects.Spider.equals(type))
			return new Spider();
		else 
			throw new InvalidSpeciesException(type);
	}

}
