package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Seaturtle;



public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal(String type){
		 	if (Constants.Animals.Reptiles.Snake.equals(type))
		 		return new Snake();
		    else if (Constants.Animals.Reptiles.Lizard.equals(type))
		 	    return new Lizard();
		    else if (Constants.Animals.Reptiles.Seaturtle.equals(type))
		 	    return new Seaturtle();
		    else return null;
		 			
		 		
		 	}
}
