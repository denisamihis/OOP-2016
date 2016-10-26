package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Ostrich;
import javasmmr.zoowsome.models.animals.Woodpecker;
import javasmmr.zoowsome.models.animals.Vulture;



public class BirdFactory extends SpeciesFactory {
	@Override
	 	public Animal getAnimal(String type){
	 	   if (Constants.Animals.Birds.Ostrich.equals(type))
	 		  return new Ostrich();
	 	   else if (Constants.Animals.Birds.Vulture.equals(type))
	 			return new Vulture();
	 	   else if (Constants.Animals.Birds.Woodpecker.equals(type))
	 			return new Woodpecker();
	 	   else return null;
	 		
	 	}
}
