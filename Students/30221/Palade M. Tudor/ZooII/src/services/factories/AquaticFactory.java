package services.factories;
import models.animals.*;
public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if (Constants.Animals.Aquatics.Shark.equals(type)){
			return new Shark();
		}
		else if (Constants.Animals.Aquatics.Tuna.equals(type)){
			return new Tuna();
		}
		else if (Constants.Animals.Aquatics.Jellyfish.equals(type)){
			return new Jellyfish();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}