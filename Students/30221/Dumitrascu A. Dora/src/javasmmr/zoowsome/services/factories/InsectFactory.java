package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;


public class InsectFactory extends SpeciesFactory{
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animal.Insects.Butterfly.equals(type)){
			return new Butterfly();
		}
		else if(Constants.Animal.Insects.Spider.equals(type)){
			return new Spider();
		}
		else if(Constants.Animal.Insects.Cockroach.equals(type)){
			return new Cockroach();
			}
		
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
