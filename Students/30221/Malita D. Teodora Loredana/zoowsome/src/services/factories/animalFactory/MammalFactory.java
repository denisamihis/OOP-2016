package services.factories.animalFactory;

import models.animlas.Animal;
import models.animlas.Cat;
import models.animlas.Dog;
import models.animlas.Tiger;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException{
			if (Constants.Animals.Mammals.Dog.equals(type)) 
				return new Dog(); 
			else if (Constants.Animals.Mammals.Cat.equals(type)) 	
				return new Cat();
			else if (Constants.Animals.Mammals.Tiger.equals(type))
				return new Tiger();
			else 
				throw new InvalidSpeciesException(type);
		}
	}





