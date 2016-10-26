package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.FishFresh;






public class AquaticFactory extends SpeciesFactory{
	
	    @Override
	 	public Animal getAnimal(String type){
	 		if (Constants.Animals.Aquatics.Whale.equals(type))
	 			return new Whale();
	 		 else if (Constants.Animals.Aquatics.Shark.equals(type))
	 			return new Shark();
	 		 else if (Constants.Animals.Aquatics.FishFresh.equals(type))
	 			return new FishFresh();
	 		 else
	 			return null;
	 		}
	

}
