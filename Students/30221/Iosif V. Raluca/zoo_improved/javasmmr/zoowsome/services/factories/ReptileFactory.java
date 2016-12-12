package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Chameleon;

public class ReptileFactory extends SpeciesFactory{
	

	@Override
	public Animal getAnimal(String type){
		if (Constants.Animals.Reptiles.Crocodile.equals(type)){
			return new Crocodile();
		} else if (Constants.Animals.Reptiles.Lizard.equals(type)){
			return new Lizard();
		} else if (Constants.Animals.Reptiles.Chameleon.equals(type)){
			return new Chameleon();
		} else{
			//throw new Exception("Invalid animal exception!"); //this gives an error
			return null;
		}
	}

}
