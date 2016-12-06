package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal (String type) throws Exception {
		if(Constants.Animals.Birds.CHICKEN.equals(type)) {
			return new Chicken();
		} else if (Constants.Animals.Birds.EAGLE.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Birds.PIGEON.equals(type)) {
			return new Pigeon();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}