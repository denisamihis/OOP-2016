package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animals.Aquatics.Whale.equals(type)){
			return new Whale();
		}
		else if(Constants.Animals.Aquatics.Dolphin.equals(type)){
			return new Dolphin();
		}
		else if(Constants.Animals.Aquatics.Seal.equals(type)){
			return new Seal();
			}
		
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
