package javasmmr.zoowsome.controllers;
import java.util.ArrayList;
import java.util.Scanner;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;

import java.math.BigDecimal;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
	public static void main(String[] args) throws Exception{
		
		//CREATION OF AN ANIMALFACTORY
		AnimalFactory abstractFactory = new AnimalFactory();
		
		//CREATION OF FACTORY FOR EACH SPECIES
		SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		SpeciesFactory birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
		SpeciesFactory insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insect);
		SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		
		//ARRAY TO CHOOSE RANDOM ANIMAL
		String[] animalArr=new String[]{"Alligator","Butterfly","Chameleon","Cockroach","Cow","Dolphin","Monkey","Parrot","Penguin","Seal","Spider","Tiger","Turtle","Vulture","Whale"};
		
		//ARRAY FOR RANDOM NAMES
		String[] animalName=new String[]{"Pikachu","Squirtle","Bulbasaur","Magikarp","Zubat","Jigglypuff","Pigeotto","Meowth","Onyx","Staryu","Mewtwo","Metapod","Butterfree","Charmender","Ekans","Clefairy","Psyduck","Snorlax","Seel"};
		
		Scanner in=new Scanner(System.in);
		System.out.println("Number of animals to be generated:");
		int nrAnimals=in.nextInt(); //how many random animals do we want?
		in.close();
		Animal[] animal=new Animal[nrAnimals]; //here we will store the generated animals
		
		for(int i=0;i<nrAnimals;i++){
			int randSpecies=(int)(Math.random()*(animalArr.length-1)+1); // randomizing an animal
			int randName=(int)(Math.random()*(animalName.length-1)+1); //randomizing a name for the animal
			
			String randAnimal=animalArr[randSpecies]; // choosing a random animal from animalArr
			
			switch(randAnimal){
			//MAMMALS
			case "Cow":{
				animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Cow);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the cow has "+
								animal[i].getNrOfLegs()+" legs.\n It's body temperature is: "+
								((Cow)animal[i]).getNormalBodyTemp()+".\n It's body is "+
								((Cow)animal[i]).getPercBodyHair()+"% covered in hair.\n");
				break;
			}
			case "Monkey":{
				animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Monkey);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the monkey has "+
								animal[i].getNrOfLegs()+" legs.\n It's body temperature is: "+
								((Monkey)animal[i]).getNormalBodyTemp()+".\n It's body is "+
								((Monkey)animal[i]).getPercBodyHair()+"% covered in hair.\n");
				break;
			}
			case "Tiger":{
				animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the tiger has "+
								animal[i].getNrOfLegs()+" legs.\n It's body temperature is: "+
								((Tiger)animal[i]).getNormalBodyTemp()+".\n It's body is "+
								((Tiger)animal[i]).getPercBodyHair()+"% covered in hair.\n");
				break;
			}
			//AQUATICS
			
			case "Dolphin":{
				animal[i]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the dolphin has "+
								animal[i].getNrOfLegs()+" legs.\n It's watertype is: "+
								((Dolphin)animal[i]).getWaterType()+".\n It's average swim depth is: "+
								((Dolphin)animal[i]).getSwimDepth()+".\n");
				break;
			}
			case "Seal":{
				animal[i]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Seal);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the seal has "+
								animal[i].getNrOfLegs()+" legs.\n It's watertype is: "+
								((Seal)animal[i]).getWaterType()+".\n It's average swim depth is: "+
								((Seal)animal[i]).getSwimDepth()+".\n");
				break;
			}
			case "Whale":{
				animal[i]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Whale);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the whale has "+
								animal[i].getNrOfLegs()+" legs.\n It's watertype is: "+
								((Whale)animal[i]).getWaterType()+".\n It's average swim depth is: "+
								((Whale)animal[i]).getSwimDepth()+".\n");
				break;
			}
			//BIRDS
			
			case "Parrot":{
				animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Parrot);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the parrot has "+
								animal[i].getNrOfLegs()+" legs.\n Does it migrate?-> "+
								((Parrot)animal[i]).getMigrates()+".\n It's average flight altitude is: "+
								((Parrot)animal[i]).getFlightAltitude()+".\n");
				break;
			}
			case "Penguin":{
				animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Penguin);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the penguin has "+
								animal[i].getNrOfLegs()+" legs.\n Does it migrate?-> "+
								((Penguin)animal[i]).getMigrates()+".\n It's average flight altitude is: "+
								((Penguin)animal[i]).getFlightAltitude()+".\n");
				break;
			}
			case "Vulture":{
				animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Vulture);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the vulture has "+
								animal[i].getNrOfLegs()+" legs.\n Does it migrate?-> "+
								((Vulture)animal[i]).getMigrates()+".\n It's average flight altitude is: "+
								((Vulture)animal[i]).getFlightAltitude()+".\n");
				break;
			}
			//INSECTS
			
			case "Butterfly":{
				animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the butterfly has "+
								animal[i].getNrOfLegs()+" legs.\n Can it fly?-> "+
								((Butterfly)animal[i]).getCanFly()+".\n Is it dangerous?-> "+
								((Butterfly)animal[i]).getIsDangerous()+".\n");
				break;
			}
			case "Cockroach":{
				animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Cockroach);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the cockroach has "+
								animal[i].getNrOfLegs()+" legs.\n Can it fly?-> "+
								((Cockroach)animal[i]).getCanFly()+".\n Is it dangerous?-> "+
								((Cockroach)animal[i]).getIsDangerous()+".\n");
				break;
			}
			case "Spider":{
				animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Spider);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the spider has "+
								animal[i].getNrOfLegs()+" legs.\n Can it fly?-> "+
								((Spider)animal[i]).getCanFly()+".\n Is it dangerous?-> "+
								((Spider)animal[i]).getIsDangerous()+".\n");
				break;
			}
			//REPTILES
			
			case "Alligator":{
				animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Alligator);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the alligator has "+
								animal[i].getNrOfLegs()+" legs.\n Does it lay eggs?-> "+
								((Alligator)animal[i]).getLaysEggs()+".\n");
				break;
			}
			case "Chameleon":{
				animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Chameleon);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the chameleon has "+
								animal[i].getNrOfLegs()+" legs.\n Does it lay eggs?-> "+
								((Chameleon)animal[i]).getLaysEggs()+".\n");
				break;
			}
			case "Turtle":{
				animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Turtle);
				animal[i].setName(animalName[randName]);
				System.out.print(animal[i].getName()+",the turtle has "+
								animal[i].getNrOfLegs()+" legs.\n Does it lay eggs?-> "+
								((Turtle)animal[i]).getLaysEggs()+".\n");
				break;
			}
			default: System.out.print("Non-existent animal in the zoo!");
			}
		}
		//TODO -- same shit with employees!!!!!!!!!!!!!!!1
		ArrayList<Animal> array = new ArrayList<Animal>();
		AnimalRepository data = new AnimalRepository();
		for(int i=0;i<nrAnimals;i++){
			array.add(animal[i]);
		}
		data.save(array); //here the file would have been created
		
		CaretakerFactory careFac = new CaretakerFactory();	
		//ARRAY FOR EMPLOYEE NAME
		String[] empName=new String[]{"Joe","Bill","Cathy","Dora","Michael","Tom","Jeff","Monica","Sydney"};
		
		//let's generate 5 employees
		Employee[] employee=new Employee[5]; //here the id and isDead attributes are set
		for(int i=0;i<5;i++){ 				 //here we will set the name, salary and workinghours
			employee[i]=careFac.getEmployeeFactory(Constants.Employee.Caretaker);
			int randName=(int)(Math.random()*(empName.length-1)+1); //generate a name for the employee
			BigDecimal sal=new BigDecimal(100+(int)(Math.random()*900+1)); //generate salary in the range of [100,1000];
			double whours=Math.random()*(double)14+(double)1; 							 // generate workinghours in the range of [0,15];
			
			employee[i]=new Caretaker(empName[randName],sal,whours);	 //set values for the remaining fields for the employee
		}
		/*-----------------------------------------
		printEmp(employee);
		//RUSSIAN-ROULETTING WITH EMPLOYEES/ANIMALS
		String result;
		for(int i=0;i<5;i++){
			for(int j=0;j<nrAnimals;j++){
				if(employee[i].getIsDead()==false && animal[j].getCare()==false){
					result=employee[i].takeCareOf(animal[j]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						employee[i].setIsDead(true);
						System.out.println(employee[i].getName()+" died while taking care of "+animal[j].getName());
					}
					else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
						System.out.println(employee[i].getName()+" has no time to take care of "+animal[j].getName());
						continue;
					}
					else{
						System.out.println(employee[i].getName()+" took care of "+animal[j].getName());
						animal[j].setCare(true);
					}
				}
			}
		}
		System.out.print("----------\nWere all animals taken care of?\nAnswer:"+printAnimals(animal,nrAnimals)+"\n");
		printEmp(employee);
		----------------------------------------------*/
		
	}	
	//if an animal hasn't been taken care of, we set allTakenCareOf to false
	public static boolean printAnimals(Animal[] animal, int n){
		boolean allTakenCareOf=true;
		for(int i=0;i<n;i++){
			if(animal[i].getCare()==false){
				allTakenCareOf=false;
				break;
			}
		}
		return allTakenCareOf;
	}
	//printing out info about employees
	public static void printEmp(Employee[] employee){
		System.out.println("-----Employees-----");
		for(int i=0;i<5;i++){
			System.out.println(employee[i].getName()+","+employee[i].getSalary()+","+employee[i].getIsDead()+","+(int)((Caretaker)employee[i]).getWorkingHours());
		}
		System.out.println("----------");
	}
}
