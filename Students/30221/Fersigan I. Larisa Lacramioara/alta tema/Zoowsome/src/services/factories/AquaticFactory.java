package services.factories;

import models.animals.Animal;
import models.animals.Dolphin;
import models.animals.Squid;
import models.animals.Octopuses;
import models.animals.WaterType;


public  class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(WaterType type) throws Exception {
		if (Constants.Animal.Aquatic.Dolphin.equals(type) ) {
				return new Dolphin(type); } 
		if (Constants.Animal.Aquatic.Squid.equals(type) ) {
				return new Squid(type);}
		else if (Constants.Animal.Aquatic.Octopuses.equals(type) ) 
					return new Octopuses(type);
		else 
				throw new Exception("Invalid SimpleName exception!");

		}

	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
