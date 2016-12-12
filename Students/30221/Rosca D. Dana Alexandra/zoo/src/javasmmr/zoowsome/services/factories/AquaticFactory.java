package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Pirahna;
import javasmmr.zoowsome.models.animals.Mermaid;
import javasmmr.zoowsome.models.animals.Dolphin;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception{
		 if(Constants.Animals.Aquatic.Dolphin.equals(type))
		 return new Dolphin();
		 else
			 if(Constants.Animals.Aquatic.Mermaid.equals(type))
				 return new Mermaid();
		 			else
		 				if(Constants.Animals.Aquatic.Pirahna.equals(type))
		 					return new Pirahna();
		 				else 
		 					throw new Exception("Invalid animal exception!");	
	}
}
