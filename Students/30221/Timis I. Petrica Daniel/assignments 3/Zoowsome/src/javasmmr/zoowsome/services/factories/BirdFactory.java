package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Ostrich;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Vulture;

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
