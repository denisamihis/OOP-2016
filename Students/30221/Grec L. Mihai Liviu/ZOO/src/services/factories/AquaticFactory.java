package services.factories;
import models.animals.*;
public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if (Constants.Animals.Aquatics.Dolphin.equals(type)){
			return new Dolphin();
		}
		else if (Constants.Animals.Aquatics.Penguin.equals(type)){
			return new Penguin();
		}
		else if (Constants.Animals.Aquatics.Seal.equals(type)){
			return new Seal();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}
