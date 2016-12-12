package services.factories.animalFactory;

import models.animlas.Animal;
import models.animlas.Crab;
import models.animlas.Seal;
import models.animlas.Solmon;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException {
		if (Constants.Animals.Aquatics.Solmon.equals(type)) 
			return new Solmon(); 
		else if (Constants.Animals.Aquatics.Seal.equals(type)) 	
			return new Seal();
		else if (Constants.Animals.Aquatics.Crab.equals(type))
			return new Crab();
		else 
			throw new InvalidSpeciesException(type);
	}

}
