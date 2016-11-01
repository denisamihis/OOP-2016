package services.factories;

import models.animals.Animal;
import models.animals.Stork;
import models.animals.Parrots;
import models.animals.Pinguin;

public  class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Bird.Stork.equals(null) ) {
				return new Stork(); } 
		if (Constants.Animal.Bird.Parrots.equals(null) ) {
				return new Parrots();}
		else if (Constants.Animal.Bird.Pinguin.equals(null) ) 
					return new Pinguin();
		else 
				throw new Exception("Invalid SimpleName exception!");

		}
}
