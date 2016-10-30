package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;

	public class ReptileFactory extends SpeciesFactory {
	
		public Animal getAnimal(String type) throws Exception
		{
			if(Constants.Animals.Reptiles.Crocodile.equals(type))
				return new Crocodile(5.4,0.7);
			else
				if(Constants.Animals.Reptiles.Snake.equals(type))
					return new Snake(4.2,0.6);
				else
					if(Constants.Animals.Reptiles.Turtle.equals(type))
						return new Turtle(3.9,0.1);
					else
						System.out.println("Invalid animal exception");
			throw new Exception("Invalid animal provided.");
		}
		
}
