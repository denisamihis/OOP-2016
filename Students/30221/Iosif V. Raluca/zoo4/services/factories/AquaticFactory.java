package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Tuna;

public class AquaticFactory extends SpeciesFactory{


	@Override
	public Animal getAnimal(String type){
		if (Constants.Animals.Aquatics.Dolphin.equals(type)){
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)){
			return new Shark();
		} else if (Constants.Animals.Aquatics.Tuna.equals(type)){
			return new Tuna();
		} else{
			//throw new Exception("Invalid animal exception!"); //this gives me an error
			return null;
		}
	}
}
