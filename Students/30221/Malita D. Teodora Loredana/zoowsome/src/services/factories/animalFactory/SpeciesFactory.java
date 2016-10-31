package services.factories.animalFactory;

import models.animlas.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal (String type) throws InvalidSpeciesException;
}
