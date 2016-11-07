package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.Constants;



public class MainController {
	public static void main(String[] args ) throws Exception {
		boolean dead , care;
		String result = "";
		CreateZoo z1= new CreateZoo();
		Animal [] zoo = new Animal[101];
		zoo = z1.Create(50);
		for(int i=0;i<zoo.length;i++)
			System.out.println("The chosen animal is "+zoo[i].getName() + " and has " +zoo[i].getNrOfLegs() + " legs");
		HireCaretakers h1 = new HireCaretakers();
		Caretaker [] squad = new Caretaker[500];
		squad = h1.Hire(25);
		for(int i=0;i<squad.length;i++)
			System.out.println(squad[i].getName() + " lucreaza " + squad[i].getWorkingHours()+ " si castiga " + squad[i].getSalary());
		//SA INCEAPA RULETA RUSEASCA , SCAPA CINE POATE 
		for(int c=0;c<squad.length;c++){
			for(int a=0;a<zoo.length;a++){
				dead=squad[c].getIsDead();
				care=zoo[a].getTakenCareOf();
				if(!dead && !care)
					result=((Caretaker)squad[c]).takeCareOf(zoo[a]);

				 if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
				         squad[c].setIsDead(true);
				 }
				 else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
				 	    continue;
				 }
				 else zoo[a].setTakenCareOf(true);
				
			}
		}
		for(int i=0;i<zoo.length;i++){
			care=zoo[i].getTakenCareOf();
			if(care)
				System.out.println("Animalutzul " + zoo[i].getName() + " a fost ingrijiiiit si e fericiiiit");
		}
		
		
	}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String[] species = { Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects,Constants.Species.Birds, Constants.Species.Aquatics };
		String[][] animals = { 
				 				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow }, 
								{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Seaturtle, Constants.Animals.Reptiles.Lizard },
				 				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach }, 
								{ Constants.Animals.Birds.Woodpecker, Constants.Animals.Birds.Ostrich, Constants.Animals.Birds.Vulture },
				 			{ Constants.Animals.Aquatics.Whale, Constants.Animals.Aquatics.Shark, Constants.Animals.Aquatics.FishFresh } };
		
	   Random r1= new Random();
	   for(int i=0;i<36;i++){
		int speciesR=r1.nextInt(5);
		int animalR = r1.nextInt(3);
		AnimalFactory randomFactory = new AnimalFactory();
		SpeciesFactory speciesrandomFactory = randomFactory.getSpeciesFactory(species[speciesR]);
		Animal randomAnimal = speciesrandomFactory.getAnimal(animals[speciesR][animalR]);
		System.out.println("Animalul ales random este "+randomAnimal.getName() + " si are " +randomAnimal.getNrOfLegs() + " legs");
	   */
	    
