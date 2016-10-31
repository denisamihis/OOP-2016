package services.factories;

import models.animals.Animal;
import models.animals.Dolphin;
import models.animals.Squid;
import models.animals.Octopuses;


public  class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Aquatic.Dolphin.equals(null) ) {
				return new Dolphin(); } 
		if (Constants.Animal.Aquatic.Squid.equals(null) ) {
				return new Squid();}
		else if (Constants.Animal.Aquatic.Octopuses.equals(null) ) 
					return new Octopuses();
		else 
				throw new Exception("Invalid SimpleName exception!");

		}
}
