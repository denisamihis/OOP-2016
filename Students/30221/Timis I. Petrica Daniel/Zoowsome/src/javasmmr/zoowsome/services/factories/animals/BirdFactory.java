package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.constants.*;

public class BirdFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin();
		} else if(Constants.Animals.Birds.Ostrich.equals(type)) {
			return new Ostrich();
		} else if (Constants.Animals.Birds.Vulture.equals(type)) {
			return new Vulture();
		} else 
			throw new Exception("Invalid animal exception!");
	}

}
