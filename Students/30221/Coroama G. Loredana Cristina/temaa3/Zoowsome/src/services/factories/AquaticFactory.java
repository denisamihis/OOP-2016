package services.factories;


import models.animals.Animal;




import models.animals.ReggaeShark;
import models.animals.SeaHorse;

import models.animals.Dolphin;

public class AquaticFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(String type) throws Exception { 
	if (Constants.Animal.Aquatic.ReggaeShark.equals(null))
	{ return new ReggaeShark(); // leave empty constructor, for now! 
	} else if (Constants.Animal.Aquatic.SeaHorse.equals(null)) 
	{ return new SeaHorse(); } 
	else if (Constants.Animal.Aquatic.Dolphin.equals(null)) 
	{ return new Dolphin(); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}
}