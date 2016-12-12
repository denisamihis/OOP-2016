package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else if(Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard();
		} else
			throw new Exception("Invalid animal exception!");
	}

}
