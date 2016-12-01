package services.factories;
import models.animals.*;
public class ReptileFactory extends SpeciesFactory{
	public animals getAnimal (String type) throws Exception{
		if (Constants.Animals.Reptiles.Crock.equals(type)){
			return new crock();
		}
		else if (Constants.Animals.Reptiles.Snake.equals(type)){
			return new snake();
		}
		else if (Constants.Animals.Reptiles.Lizard.equals(type)){
			return new lizard();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}