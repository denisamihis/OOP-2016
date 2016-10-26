package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cameleon;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Scorpion;

public class ReptileFactory extends SpeciesFactory{
	
	public Animal getAnimal(String type) throws Exception{
		 if(Constants.Animals.Reptile.Scorpion.equals(type))
			return new Scorpion();
		 		else
		 			if(Constants.Animals.Reptile.Cameleon.equals(type))
		 				return new Cameleon();
		 			else
		 				if(Constants.Animals.Reptile.Snake.equals(type))
		 					return new Snake();
		 				else 
		 					throw new Exception("Invalid animal exception!");	
		 	}

}
