package services.factories.animalFactory;

import models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws InvalidSpeciesException;
}
