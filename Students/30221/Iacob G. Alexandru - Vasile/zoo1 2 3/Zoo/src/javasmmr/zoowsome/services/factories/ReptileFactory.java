package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal (String type) throws Exception {
		if(Constants.Animals.Reptiles.CROCODILE.equals(type)) {
			return new Crocodile();
		} else if (Constants.Animals.Reptiles.LIZARD.equals(type)) {
			return new Lizard();
		} else if (Constants.Animals.Reptiles.SNAKE.equals(type)) {
			return new Snake();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}