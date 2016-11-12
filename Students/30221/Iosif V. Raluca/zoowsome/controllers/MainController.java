package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.models.employees.*;


import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;

import java.math.BigDecimal;
import java.util.Scanner;


public class MainController {

	public static void main(String[] args){
		
		AnimalFactory abstractFactory= new AnimalFactory();
		SpeciesFactory mammalFactory=abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory aquaFactory= abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory birdFactory=abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory reptileFactory= abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory insectFactory= abstractFactory.getSpeciesFactory(Constants.Species.Insects);


		
		System.out.print("How many animals do you want to check up?\n");
		
		Scanner input= new Scanner(System.in);
		int nbOfAnimals=input.nextInt();
		input.close();
		Animal[] animal = new Animal[nbOfAnimals];
		
		
		String[] animalArray= new String[]
			{"Cow","Monkey", "Butterfly", "Chameleon", "Cockroach","Crocodile", "Dolphin", "Eagle", "Lizard", "Ostrich","Phoenix","Shark","Spider","Tiger", "Tuna"};
		//array for choosing a random animal to create
		
		String [] names={"Barclay", "Barney", "Bubbles", "Cosmo","Fritz", "Goldie", "Goofy","Lexi","Midnight","Ozzie"}; 
		//for generating random names for the animals
		for (int i=0; i<nbOfAnimals; i++)
		{
			int randNum=(int) (Math.random()*14+1);//used for creating a random animal
			int randNum1=(int) (Math.random()*9+1);//used for creating a random name for the animal
			
			String randAnimal=animalArray[randNum];
			switch(randAnimal){
			//mammals
			case "Cow":{
				animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Cow);
				animal[i].setName(names[randNum1]);
						System.out.println(animal[i].getName()+", the cow:\n"+ 
											animal[i].getNrOfLegs()+" legs, "+
											((Cow)animal[i]).getNormalBodyTemp()+"body temp, "+
											((Cow)animal[i]).getPercBodyHair()+" % hair\n");
			
						break;
			}
			case "Monkey": { 
				animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Monkey);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the monkey:\n"+ 
						animal[i].getNrOfLegs()+" legs, "+
						((Monkey)animal[i]).getNormalBodyTemp()+"body temp, "+
						((Monkey)animal[i]).getPercBodyHair()+" % hair\n");
				break;
				
			}
			case "Tiger": {
				animal[i]= mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+",the tiger:\n"+ 
						animal[i].getNrOfLegs()+" legs, "+
						((Tiger)animal[i]).getNormalBodyTemp()+"body temp, "+
						((Tiger)animal[i]).getPercBodyHair()+" % hair\n");
				break;
			}
			// birds
			case "Ostrich": {
				animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Ostrich);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Ostrich:\n"+
									animal[i].getNrOfLegs()+" legs, "+
									((Ostrich)animal[i]).getAvgFlightAltitude()+"average flight altitude, "+
									((Ostrich)animal[i]).getMigrates()+"-Migrates");
				break;
			}
			case "Eagle":{
				animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Eagle);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Eagle:\n"+
						animal[i].getNrOfLegs()+" legs, "+
						((Eagle)animal[i]).getAvgFlightAltitude()+"average flight altitude, "+
						((Eagle)animal[i]).getMigrates()+"-Migrates");
				break;
				
			}
			case "Phoenix":{
				animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Phoenix);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Phoenix:\n"+
						animal[i].getNrOfLegs()+" egs, "+
						((Phoenix)animal[i]).getAvgFlightAltitude()+"average flight altitude, "+
						((Phoenix)animal[i]).getMigrates()+"-Migrates");
				break;
			}
			//insects
			case "Butterfly":{
				animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Butterfly:\n"+
									animal[i].getNrOfLegs()+" legs, "+
									((Butterfly)animal[i]).getCanFly()+"- flies, "+
									((Butterfly)animal[i]).getIsDangerous()+"- dangerous\n");
				break;
			}
			case "Cockroach":{
				animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Cockroach);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Cockroach:\n"+
									animal[i].getNrOfLegs()+" legs, "+
									((Cockroach)animal[i]).getCanFly()+"- flies, "+
									((Cockroach)animal[i]).getIsDangerous()+"- dangerous\n");
				break;
			}
			case "Spider":{
				animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Spider);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Spider:\n"+
									animal[i].getNrOfLegs()+" legs, "+
									((Spider)animal[i]).getCanFly()+"- flies, "+
									((Spider)animal[i]).getIsDangerous()+"- dangerous\n");
				break;
			}
			//reptiles
			case "Crocodile":{
				animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Crocodile);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Crocodile:\n"+
									animal[i].getNrOfLegs()+" legs, "+
									((Crocodile)animal[i]).getLaysEggs()+"- lays eggs\n");
				break;
			}
			case "Lizard":{
				animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Lizard);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the Lizard:\n"+
									animal[i].getNrOfLegs()+" legs, "+
									((Lizard)animal[i]).getLaysEggs()+"- lays eggs\n");
				break;
			}
			case "Chameleon":{
				animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Chameleon);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the chameleon:\n"+
						animal[i].getNrOfLegs()+" legs, "+
									((Chameleon)animal[i]).getLaysEggs()+"- lays eggs\n");
				break;
			}
			// aquatics
			case "Tuna":{
				animal[i]=aquaFactory.getAnimal(Constants.Animals.Aquatics.Tuna);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the tuna:\n"+
						animal[i].getNrOfLegs()+" legs, "+
									((Tuna)animal[i]).getAvgSwimDepth()+"- average swim depth, "+ 
									((Tuna)animal[i]).getWaterType());
				break;
			}
			case "Dolphin":{
				animal[i]=aquaFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the dolphin:\n"+
						animal[i].getNrOfLegs()+" legs, "+
									((Dolphin)animal[i]).getAvgSwimDepth()+"- average swim depth, "+ 
									((Dolphin)animal[i]).getWaterType());
				break;
			}
			case "Shark":{
				animal[i]=aquaFactory.getAnimal(Constants.Animals.Aquatics.Shark);
				animal[i].setName(names[randNum1]);
				System.out.println(animal[i].getName()+", the shark:\n"+
						animal[i].getNrOfLegs()+" legs, "+
									((Shark)animal[i]).getAvgSwimDepth()+"- average swim depth, "+ 
									((Shark)animal[i]).getWaterType());
				break;
			}
			}
		}
	
		Caretaker[] caretaker= new Caretaker[3];
	    caretaker[0]= new Caretaker();
		caretaker[1]= new Caretaker("Michael Fillis", 2568, BigDecimal.valueOf(253.59),false);
		caretaker[2]=new Caretaker("John Smith", 2569, BigDecimal.valueOf(152.0), false);
		caretaker[0].setWorkingHours(10);
		caretaker[1].setWorkingHours(8);
		caretaker[2].setWorkingHours(6);
		
		for (Caretaker c: caretaker){
			for(Animal a: animal){
				if ( c.isDead()==false && a.isTakenCareOf()==false)
				{
					String result=c.TakeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						c.setDead(true);
						System.out.println("R.I.P "+c.getName());
					}
					else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
						System.out.println(a.getName()+" could not be taken care of");
					}
					else{
						a.setTakenCareOf(true);
					}
				}
				
			}
		}
			int toBeTakenCareOf=0;
		 for (Animal a: animal){
			 if (a.isTakenCareOf()==false){
				 toBeTakenCareOf++;
			 }
		 }
		 if (toBeTakenCareOf!=0){
			 System.out.println("There are still "+toBeTakenCareOf+" animals to be taken care of");
		 	}
		 else{
			 System.out.println("All the animals were taken care of");
		 }
		
		

		
		
		
		
					
	}
	
	
}
