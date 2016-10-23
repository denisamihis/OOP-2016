package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animal.Reptiles.Alligator.equals(type)){
			return new Alligator();
		}
		else if(Constants.Animal.Reptiles.Turtle.equals(type)){
			return new Turtle();
		}
		else if(Constants.Animal.Reptiles.Chameleon.equals(type)){
			return new Chameleon();
			}
		
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
