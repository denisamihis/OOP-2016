package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.BUTTERFLY.equals(type)) {
			return new Butterfly();
		} else if(Constants.Animals.Insects.SPIDER.equals(type)) {
			return new Spider();
		} else if (Constants.Animals.Insects.COCKROACH.equals(type)) {
			return new Cockroach();
		} else
			throw new Exception("Invalid animal exception!");
	}

}
