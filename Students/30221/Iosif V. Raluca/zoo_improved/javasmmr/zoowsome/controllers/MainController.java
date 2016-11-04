package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.SpeciesFactory;



import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
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
		int n=input.nextInt();
		input.close();
		String[] animalArray= new String[]
			{"Cow","Monkey", "Butterfly", "Chameleon", "Cockroach","Crocodile", "Dolphin", "Eagle", "Lizard", "Ostrich","Phoenix","Shark","Spider","Tiger", "Tuna"};
		for (int i=0; i<n; i++)
		{
			int randNum=(int) (Math.random()*14+1);
			String randAnimal=animalArray[randNum];
			switch(randAnimal){
			//mammals
			case "Cow":{
				Animal a1=mammalFactory.getAnimal(Constants.Animals.Mammals.Cow);
			
						System.out.println(a1.getName()+":\n"+ 
											a1.getNrOfLegs()+" legs, "+
											((Cow)a1).getNormalBodyTemp()+"body temp, "+
											((Cow)a1).getPercBodyHair()+" % hair\n");
			
						break;
			}
			case "Monkey": { 
				Animal a1=mammalFactory.getAnimal(Constants.Animals.Mammals.Monkey);
				System.out.println(a1.getName()+":\n"+ 
						a1.getNrOfLegs()+" legs, "+
						((Monkey)a1).getNormalBodyTemp()+"body temp, "+
						((Monkey)a1).getPercBodyHair()+" % hair\n");
				break;
				
			}
			case "Tiger": {
				Animal a1= mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
				System.out.println(a1.getName()+":\n"+ 
						a1.getNrOfLegs()+" legs, "+
						((Tiger)a1).getNormalBodyTemp()+"body temp, "+
						((Tiger)a1).getPercBodyHair()+" % hair\n");
				break;
			}
			// birds
			case "Ostrich": {
				Animal a1=birdFactory.getAnimal(Constants.Animals.Birds.Ostrich);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Ostrich)a1).getAvgFlightAltitude()+"average flight altitude, "+
									((Ostrich)a1).getMigrates()+"-Migrates");
				break;
			}
			case "Eagle":{
				Animal a1=birdFactory.getAnimal(Constants.Animals.Birds.Eagle);
				System.out.println(a1.getName()+":\n"+
						a1.getNrOfLegs()+" legs, "+
						((Eagle)a1).getAvgFlightAltitude()+"average flight altitude, "+
						((Eagle)a1).getMigrates()+"-Migrates");
				break;
				
			}
			case "Phoenix":{
				Animal a1=birdFactory.getAnimal(Constants.Animals.Birds.Phoenix);
				System.out.println(a1.getName()+":\n"+
						a1.getNrOfLegs()+" egs, "+
						((Phoenix)a1).getAvgFlightAltitude()+"average flight altitude, "+
						((Phoenix)a1).getMigrates()+"-Migrates");
				break;
			}
			//insects
			case "Butterfly":{
				Animal a1=insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Butterfly)a1).getCanFly()+"- flies, "+
									((Butterfly)a1).getIsDangerous()+"- dangerous\n");
				break;
			}
			case "Cockroach":{
				Animal a1=insectFactory.getAnimal(Constants.Animals.Insects.Cockroach);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Cockroach)a1).getCanFly()+"- flies, "+
									((Cockroach)a1).getIsDangerous()+"- dangerous\n");
				break;
			}
			case "Spider":{
				Animal a1=insectFactory.getAnimal(Constants.Animals.Insects.Spider);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Spider)a1).getCanFly()+"- flies, "+
									((Spider)a1).getIsDangerous()+"- dangerous\n");
				break;
			}
			//reptiles
			case "Crocodile":{
				Animal a1=reptileFactory.getAnimal(Constants.Animals.Reptiles.Crocodile);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Crocodile)a1).getLaysEggs()+"- lays eggs\n");
				break;
			}
			case "Lizard":{
				Animal a1=reptileFactory.getAnimal(Constants.Animals.Reptiles.Lizard);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Lizard)a1).getLaysEggs()+"- lays eggs\n");
				break;
			}
			case "Chameleon":{
				Animal a1=reptileFactory.getAnimal(Constants.Animals.Reptiles.Chameleon);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Chameleon)a1).getLaysEggs()+"- lays eggs\n");
				break;
			}
			// aquatics
			case "Tuna":{
				Animal a1=aquaFactory.getAnimal(Constants.Animals.Aquatics.Tuna);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Tuna)a1).getAvgSwimDepth()+"- average swim depth, "+ 
									((Tuna)a1).getWaterType());
				break;
			}
			case "Dolphin":{
				Animal a1=aquaFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Dolphin)a1).getAvgSwimDepth()+"- average swim depth, "+ 
									((Dolphin)a1).getWaterType());
				break;
			}
			case "Shark":{
				Animal a1=aquaFactory.getAnimal(Constants.Animals.Aquatics.Shark);
				System.out.println(a1.getName()+":\n"+
									a1.getNrOfLegs()+" legs, "+
									((Shark)a1).getAvgSwimDepth()+"- average swim depth, "+ 
									((Shark)a1).getWaterType());
				break;
			}
			}
		}
	
		
		
		
		
		
					
	}
	
	
}
