package services.factories;


import models.animals.Animal;




import models.animals.ReggaeShark;
import models.animals.SeaHorse;
import models.animals.WaterType;
import models.animals.Dolphin;

public class AquaticFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(WaterType type) throws Exception { 
	if (Constants.Animal.Aquatic.ReggaeShark.equals(type))
	{ return new ReggaeShark(type); // leave empty constructor, for now! 
	} else if (Constants.Animal.Aquatic.SeaHorse.equals(type)) 
	{ return new SeaHorse(type); } 
	else if (Constants.Animal.Aquatic.Dolphin.equals(type)) 
	{ return new Dolphin(type); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}

	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}