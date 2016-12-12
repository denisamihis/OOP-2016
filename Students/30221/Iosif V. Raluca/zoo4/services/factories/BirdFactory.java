package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Ostrich;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Phoenix;

public class BirdFactory extends SpeciesFactory {


	@Override
	public Animal getAnimal(String type){
		if (Constants.Animals.Birds.Ostrich.equals(type)){
			return new Ostrich();
		} else if (Constants.Animals.Birds.Eagle.equals(type)){
			return new Eagle();
		} else if (Constants.Animals.Birds.Phoenix.equals(type)){
			return new Phoenix();
		} else{
			//throw new Exception("Invalid animal exception!"); //this gives me an error
			return null;
		}
	}
}
