package services.factories;


import models.animals.Animal;

import models.animals.Lizard;

import models.animals.Snake;

import models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(String type) throws Exception { 
	if (Constants.Animal.Reptile.Turtle.equals(type))
	{ return new Turtle(); // leave empty constructor, for now! 
	} else if (Constants.Animal.Reptile.Snake.equals(type)) 
	{ return new Snake(); } 
	else if (Constants.Animal.Reptile.Lizard.equals(type)) 
	{ return new Lizard(); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}
}