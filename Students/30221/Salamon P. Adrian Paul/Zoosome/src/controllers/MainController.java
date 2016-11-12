package controllers;

import java.util.ArrayList;

import models.animals.Animal;
import models.animals.Hen;
import repositories.AnimalRepository;
import servicies.factory.animal.AnimalFactory;
import servicies.factory.animal.Constants;
import servicies.factory.animal.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Ant);

		System.out.printf("We have an animal with %d legs!\n",a1.getNrOfLegs());
		
		Hen hen= new Hen();
		AnimalRepository anRep=new AnimalRepository();
		ArrayList<Animal> arrayList1=new ArrayList<Animal>();
		arrayList1.add(hen);
		
		anRep.save(arrayList1);
		anRep.load();
		

	}

}
