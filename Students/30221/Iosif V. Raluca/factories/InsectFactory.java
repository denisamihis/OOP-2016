package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Butterfly;



public class InsectFactory extends SpeciesFactory {


	@Override
	public Animal getAnimal(String type){
		if (Constants.Animals.Insects.Cockroach.equals(type)){
			return new Cockroach();
		} else if (Constants.Animals.Insects.Spider.equals(type)){
			return new Spider();
		} else if (Constants.Animals.Insects.Butterfly.equals(type)){
			return new Butterfly();
		} else{
			//throw new Exception("Invalid animal exception!"); //this gives me an error
			return null;
			
		}
	}
}
