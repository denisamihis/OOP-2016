package services.factories;


import models.animals.Animal;

import models.animals.Lizard;

import models.animals.Snake;

import models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(String type) throws Exception { 
	if (Constants.Animal.Reptile.Turtle.equals(null))
	{ return new Turtle(); // leave empty constructor, for now! 
	} else if (Constants.Animal.Reptile.Snake.equals(null)) 
	{ return new Snake(); } 
	else if (Constants.Animal.Reptile.Lizard.equals(null)) 
	{ return new Lizard(); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}
}