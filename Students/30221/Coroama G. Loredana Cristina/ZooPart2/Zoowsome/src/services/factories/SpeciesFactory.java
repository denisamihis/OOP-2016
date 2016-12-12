package services.factories;

import models.animals.Animal;
import models.animals.WaterType;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;

	public Animal getAnimal(WaterType type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
