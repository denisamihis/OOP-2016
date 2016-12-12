package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal (String type) throws Exception {
		
		if (Constants.Animals.Aquatics.Dolphin.equals(type)){
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Salmon.equals(type)){
			return new Salmon();
		}else if (Constants.Animals.Aquatics.Whale.equals(type)){
			return new Whale();
		}
		else {
			throw new Exception ("Invalid animal exception!");
		}
	} 

}
