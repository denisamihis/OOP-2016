package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.constants.*;

public class ReptileFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.SNAKE.equals(type)) {
			return new Snake();
		} else if(Constants.Animals.Reptiles.TURTLE.equals(type)) {
			return new Turtle();
		} else if (Constants.Animals.Reptiles.LIZARD.equals(type)) {
			return new Lizard();
		} else
			throw new Exception("Invalid animal exception!");
	}

}
