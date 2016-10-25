package services.factories;
import models.animals.*;

public abstract class SpeciesFactory {
	public abstract animals getAnimal( String type) throws Exception;
}