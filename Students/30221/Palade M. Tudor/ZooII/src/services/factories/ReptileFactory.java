package services.factories;
import models.animals.*;
public class ReptileFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if (Constants.Animals.Reptiles.Crocodile.equals(type)){
			return new Crocodile();
		}
		else if (Constants.Animals.Reptiles.Snake.equals(type)){
			return new Snake();
		}
		else if (Constants.Animals.Reptiles.Lizzard.equals(type)){
			return new Lizzard();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}