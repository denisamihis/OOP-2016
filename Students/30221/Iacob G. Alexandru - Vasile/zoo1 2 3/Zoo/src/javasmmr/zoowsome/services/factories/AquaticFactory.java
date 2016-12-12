package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal (String type) throws Exception {
		if(Constants.Animals.Aquatics.SHARK.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.GOLDFISH.equals(type)) {
			return new Goldfish();
		} else if (Constants.Animals.Aquatics.SALMON.equals(type)) {
			return new Salmon();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}

}
