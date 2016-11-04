package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.constants.*;

public class AquaticFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.OCTOPUS.equals(type)) {
			return new Octopus();
		} else if(Constants.Animals.Aquatics.SHARK.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.SEAHORSE.equals(type)) {
			return new Seahorse();
		} else 
			throw new Exception("Invalid animal exception!");
	}

}
