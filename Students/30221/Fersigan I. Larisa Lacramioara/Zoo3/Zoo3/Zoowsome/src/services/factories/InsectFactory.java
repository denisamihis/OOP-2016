package services.factories;

import models.animals.Animal;
import models.animals.Cockroach;
import models.animals.Butterfly;
import models.animals.Spider;

public  class InsectFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Insect.Cockroach.equals(null) ) {
				return new Cockroach(); } 
		else if (Constants.Animal.Insect.Butterfly.equals(null)) {
				return new Butterfly();}
		else if (Constants.Animal.Insect.Spider.equals(null)) 
					return new Spider();
		else 
				throw new Exception("Invalid SimpleName exception!");

		}
}
