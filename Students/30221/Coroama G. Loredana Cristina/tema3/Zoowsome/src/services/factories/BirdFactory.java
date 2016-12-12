package services.factories;


import models.animals.Animal;

import models.animals.Eagle;

import models.animals.Owl;

import models.animals.Chicken;

public class BirdFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(String type) throws Exception { 
	if (Constants.Animal.Bird.Owl.equals(null))
	{ return new Owl(); // leave empty constructor, for now! 
	} else if (Constants.Animal.Bird.Chicken.equals(null)) 
	{ return new Chicken(); } 
	else if (Constants.Animal.Bird.Eagle.equals(null)) 
	{ return new Eagle(); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}
}