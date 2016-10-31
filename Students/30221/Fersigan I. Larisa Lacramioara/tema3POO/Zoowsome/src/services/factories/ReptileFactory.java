package services.factories;

import models.animals.Animal;
import models.animals.Chameleon;
import models.animals.Frog;
import models.animals.Viper;

public  class ReptileFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Reptile.Chameleon.equals(null) ) {
				return new Chameleon(); } 
		else if (Constants.Animal.Reptile.Frog.equals(null)) {
				return new Frog();}
		else if (Constants.Animal.Reptile.Viper.equals(null)) 
					return new Viper();
		else 
				throw new Exception("Invalid SimpleName exception!");

		}
}
