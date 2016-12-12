package javasmmr.zoowsome.controllers;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javasmmr.zoowsome.models.Aligator;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.Caretaker;
import javasmmr.zoowsome.models.Cow;
import javasmmr.zoowsome.models.Dinosaur;
import javasmmr.zoowsome.models.Dolphin;
import javasmmr.zoowsome.models.Eagle;
import javasmmr.zoowsome.models.Employee;
import javasmmr.zoowsome.models.Flamingo;
import javasmmr.zoowsome.models.Jellyfish;
import javasmmr.zoowsome.models.Monkey;
import javasmmr.zoowsome.models.Pelican;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.Snake;
import javasmmr.zoowsome.models.Spider;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Wasp;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.AnimalFactory;
import javasmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.services.SpeciesFactory;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

/**
 * This is a class which contains the main subroutine. Here, we test all the animals and their attributes and see how we
 * have populated our zoo.
 * I used only 2 copies of each animal because of speeding up the program. I will change it and add more
 * copies of each animals, if needed.
 * 
 * NOTE : WHAT'S NEW IN THE SECOND PART OF THE PROBLEM (ZOO PART 2)
 * 
 * a) Added in the Animal class 2 new final fields : maintenanceCost and dangerPerc. To be able to initialize
 * both of these two, I created a constructor in the Animal class, and, of course, because I done that,
 * I also had to create constructors in all Mammal, Bird, Aquatic, Insects and Reptile classes. All these 
 * 5 constructors coresponding to species, are actually called in all 15 concrete animals' constructors,
 * using super(maintCost, dangerPerc) ( that 2 values are chosed by the user )...And as you'll notice, 
 * it's a little "chain" calling until the values reach dangerPerc and maintenanceCost in the Animal class.
 * Also, here I added the takenCareOf field in the Animal class which is initially set to false.
 * 
 * b) Added the Killer interface, which firstly contains a single method, kill(). As it says, Animal class
 * should implement this interface...So it is, all 15 concrete animals then have to contain the kill()
 * method.
 * 
 * c) Modified the Constants class and created factories for Employees ( caretakers, for now ), just like
 * it was in the first part for the species and concrete animals...
 * 
 * d) Created the Employee class and its sublcass, Caretaker with all their attributes...
 * 
 * e) Caretaker_I interface which has a single mathod: takenCareOf()
 * 
 * f) Here, in the MainController class, I have put some tests to see how the program works with this new
 * stuff. I explained this new stuff below, where it was the case..
 * 
 * e) And finally, the twist : I added the getPredisposition() method in the Killer interface, so all 15
 * concrete animals have to contain this new method. Here, I checked for the current time, and if the time
 * is in between some chosed values, then the animal has less chance ( predisposition ) of killing the 
 * caretaker ( I actually set it to 0 for every dangerous animal, to see that no caretaker will die
 * if the time is in between some certain values..Can modifiy this, increasing it a little bit, if needed).
 * The getPredisposition method is called within the kill() method, as it requires in the task. Theoretically,
 * it sets a new value for dangerPerc of the animal, using "predispositionOfAnimal" double field in kill()
 * method...If the time is NOT between that periods, then the predispositionOfAnimal will be equal to the
 * initially dangerPerc final field, set when the concrete animal had been created.
 * 
 * NOTE : WHAT'S NEW IN THE 3rd PART ( ZOO PART 3 ) :
 * >> Added everything that was required in the task, just like it said. I explained below the new added tests, here in
 * the MainController class
 * 
 */
public class MainController {
	
	public static void main(String[] args)
	{
		Animal []animals = new Animal[30]; // The big array which contains the animals put alltogether
		int i = 0; // this is the array index
		
		/**
		 * All indexes from i1 to i15 represents and holds how many animals of one type we've added
		 * to the array so far. Each coresponds to every particular animal, as we can see below.
		 */
		
		int i1 = 0; 
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		int i6 = 0;
		int i7 = 0;
		int i8 = 0;
		int i9 = 0;
		int i10 = 0;
		int i11 = 0;
		int i12 = 0;
		int i13 = 0;
		int i14 = 0;
		int i15 = 0;
		
		/**
		 * I have used these for creating and adding animals to the array using getSpeciesFactory() method and
		 * AnimalFactory class
		 */
		
		AnimalFactory abstractFactory;
		SpeciesFactory speciesFactory1;
		Animal a1;
				
		/**
		 * These are used at the end of this class for type-casting from array ( the array is populated with Animal objects
		 * though it's improper to say that because Animal it's an abstract class. So, in order to see the other attributes
		 * of an animal, besides numberOfLegs and name, we need to type-cast from Animal to a concrete animal type).
		 */
		Aligator aligator;
		Butterfly butterfly;
		Cow cow;
		Dinosaur dinosaur;
		Dolphin dolphin; 
		Eagle eagle;
		Flamingo flamingo;
		Jellyfish jellyfish;
		Monkey monkey;
		Pelican pelican;
		Shark shark;
		Snake snake;
		Spider spider;
		Tiger tiger;
		Wasp wasp;
		
		/**
		 * The while works on constructing the array. We get a random number from 1 to 15, and then, depending on it,
		 * using a Switch statement with 15 cases, we put the Animal into the array. 
		 */
		while(i<animals.length)
		{
			int randomNumber = (int)((15*Math.random())+1);
			switch(randomNumber)
			{
			case 1:
				if(i1 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
				//Cow cow = (Cow) a1;
				animals[i] = a1;
				i1++;
				i++;
				break;
			case 2:
				if(i2 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
				//Monkey monkey = (Monkey) a1;
				animals[i] = a1;
				i2++;
				i++;
				break;
			case 3:
				if(i3 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
				//Tiger tiger = (Tiger) a1;
				animals[i] = a1;
				i3++;
				i++;
				break;
			case 4:
				if(i4 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake);
				//Snake snake = (Snake) a1;
				animals[i] = a1;
				i4++;
				i++;
				break;
			case 5:
				if(i5 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Aligator);
				//Aligator aligator = (Aligator) a1;
				animals[i] = a1;
				i5++;
				i++;
				break;
			case 6:
				if(i6 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Dinosaur);
				//Dinosaur dinosaur = (Dinosaur) a1;
				animals[i] = a1;
				i6++;
				i++;
				break;
			case 7:
				if(i7 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Eagle);
				//Eagle eagle = (Eagle) a1;
				animals[i] = a1;
				i7++;
				i++;
				break;
			case 8:
				if(i8 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Flamingo);
				//Flamingo flamingo = (Flamingo) a1;
				animals[i] = a1;
				i8++;
				i++;
				break;
			case 9:
				if(i9 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Pelican);
				//Pelican pelican = (Pelican) a1;
				animals[i] = a1;
				i9++;
				i++;
				break;
			case 10:
				if(i10 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Shark);
				//Shark shark = (Shark) a1;
				animals[i] = a1;
				i10++;
				i++;
				break;
			case 11:
				if(i11 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin);
				//Dolphin dolphin = (Dolphin) a1;
				animals[i] = a1;
				i11++;
				i++;
				break;
			case 12:
				if(i12 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Jellyfish);
				//Jellyfish jellyfish = (Jellyfish) a1;
				animals[i] = a1;
				i12++;
				i++;
				break;
			case 13:
				if(i13 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
				//Butterfly butterfly = (Butterfly) a1;
				animals[i] = a1;
				i13++;
				i++;
				break;
			case 14:
				if(i14 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
				//Spider spider = (Spider) a1;
				animals[i] = a1;
				i14++;
				i++;
				break;
			case 15:
				if(i15 == 2)
					break;
				abstractFactory = new AnimalFactory();
				speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
				a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Wasp);
				//Wasp wasp = (Wasp) a1;
				animals[i] = a1;
				i15++;
				i++;
				break;
		}
		
	
	}
		
		/**
		 * This for is used for printing out the array. We verify the name of the Animal and then we convert it into the 
		 * corresponding concrete animal, using the name. Then, we can print ALL the attributes that a concrete animal has.
		 */
		
		for(int j=0;j<animals.length;j++)
		{
			
			if(animals[j].getName().equals("ALIGATOR"))
			{
				aligator = new Aligator();
				aligator = (Aligator)animals[j];
				System.out.printf("The animal on position %d is %s, it has %d legs and it is %s that"
						+ " it lays eggs. It needs %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,aligator.getName(),aligator.getNumberOfLegs(),String.valueOf(aligator.isLayingEggs()),aligator.getMaintenanceCost(), aligator.getDangerPercent());
			}
			else if(animals[j].getName().equals("SNAKE"))
			{
				snake = new Snake();
				snake = (Snake)animals[j];
				System.out.printf("The animal on position %d is %s, it has %d legs and it is %s that"
						+ " it lays eggs. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,snake.getName(),snake.getNumberOfLegs(),String.valueOf(snake.isLayingEggs()),snake.getMaintenanceCost(),snake.getDangerPercent());
			
			}
			else if(animals[j].getName().equals("DINOSAUR"))
			{
				dinosaur = new Dinosaur();
				dinosaur = (Dinosaur)animals[j];
				System.out.printf("The animal on position %d is %s, it has %d legs and it is %s that"
						+ " it lays eggs. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,dinosaur.getName(),dinosaur.getNumberOfLegs(),String.valueOf(dinosaur.isLayingEggs()),dinosaur.getMaintenanceCost(), dinosaur.getDangerPercent());
			}
			else if(animals[j].getName().equals("COW"))
			{
				cow = new Cow();
				cow = (Cow)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it has a normal body temperature of %.0f degrees, "
						+ "and it has a %.0f percent body hair. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent  \n",j,cow.getName(),cow.getNumberOfLegs(), cow.getNormalBodyTemp(),
						cow.getPercBodyHair(),cow.getMaintenanceCost(), cow.getDangerPercent());
			}
			else if(animals[j].getName().equals("MONKEY"))
			{
				monkey = new Monkey();
				monkey = (Monkey)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it has a normal body temperature of %.0f degrees, "
						+ "and it has a %.0f percent body hair. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,monkey.getName(),monkey.getNumberOfLegs(), monkey.getNormalBodyTemp(),
						monkey.getPercBodyHair(), monkey.getMaintenanceCost(),monkey.getDangerPercent());
			}
			else if(animals[j].getName().equals("TIGER"))
			{
				tiger = new Tiger();
				tiger = (Tiger)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it has a normal body temperature of %.0f degrees, "
						+ "and it has a %.0f percent body hair. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,tiger.getName(),tiger.getNumberOfLegs(), tiger.getNormalBodyTemp(),
						tiger.getPercBodyHair(), tiger.getMaintenanceCost(), tiger.getDangerPercent());
			}
			else if(animals[j].getName().equals("EAGLE"))
			{
				eagle = new Eagle();
				eagle = (Eagle)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it is %s that it migrates, and it has an average flight altitude"
						+ " of %d meters. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,eagle.getName(),eagle.getNumberOfLegs(),String.valueOf(eagle.isMigrating()),
						eagle.getAvgFlightAltitude(),eagle.getMaintenanceCost(), eagle.getDangerPercent());
			}
			else if(animals[j].getName().equals("FLAMINGO"))
			{
				flamingo = new Flamingo();
				flamingo = (Flamingo)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it is %s that it migrates, and it has an average flight altitude"
						+ " of %d meters. This bird"
						+ " cannot fly. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,flamingo.getName(),flamingo.getNumberOfLegs(),String.valueOf(flamingo.isMigrating()),
						flamingo.getAvgFlightAltitude(), flamingo.getMaintenanceCost(), flamingo.getDangerPercent());
			}
			else if(animals[j].getName().equals("PELICAN"))
			{
				pelican = new Pelican();
				pelican = (Pelican)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it is %s that it migrates, and it has an average flight altitude"
						+ " of %d meters. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,pelican.getName(),pelican.getNumberOfLegs(),String.valueOf(pelican.isMigrating()),
						pelican.getAvgFlightAltitude(),pelican.getMaintenanceCost(), pelican.getDangerPercent());
			}
			else if(animals[j].getName().equals("SHARK"))
			{
				shark = new Shark();
				shark = (Shark)animals[j];
				System.out.printf("The animal on position %d is %s,  it has"
						+ " %d legs, it swims at %d meters underwater and it lives in %s. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,shark.getName(), shark.getNumberOfLegs(),
						shark.getAvgSwimDepth(), shark.getWaterType(),shark.getMaintenanceCost(), shark.getDangerPercent());
			}
			else if(animals[j].getName().equals("DOLPHIN"))
			{
				dolphin = new Dolphin();
				dolphin = (Dolphin)animals[j];
				System.out.printf("The animal on position %d is %s,  it has"
						+ " %d legs, it swims at %d meters underwater and it lives in %s. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,dolphin.getName(), dolphin.getNumberOfLegs(),
						dolphin.getAvgSwimDepth(), dolphin.getWaterType(), dolphin.getMaintenanceCost(), dolphin.getDangerPercent());
			}
			else if(animals[j].getName().equals("JELLYFISH"))
			{
				jellyfish = new Jellyfish();
				jellyfish = (Jellyfish)animals[j];
				System.out.printf("The animal on position %d is %s,  it has"
						+ " %d legs, it swims at %d meters underwater and it lives in %s. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,jellyfish.getName(), jellyfish.getNumberOfLegs(),
						jellyfish.getAvgSwimDepth(), jellyfish.getWaterType(), jellyfish.getMaintenanceCost(), jellyfish.getDangerPercent());
			}
			else if(animals[j].getName().equals("BUTTERFLY"))
			{
				butterfly = new Butterfly();
				butterfly = (Butterfly)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it is %s that it can fly and it is %s that it's dangerous. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,butterfly.getName(),
						butterfly.getNumberOfLegs(),String.valueOf(butterfly.isFlying()),String.valueOf(butterfly.itIsDangerous()), butterfly.getMaintenanceCost(), butterfly.getDangerPercent());
			}
			else if(animals[j].getName().equals("SPIDER"))
			{
				spider = new Spider();
				spider = (Spider)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it is %s that it can fly and it is %s that it's dangerous. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent \n",j,spider.getName(),
						spider.getNumberOfLegs(),String.valueOf(spider.isFlying()),String.valueOf(spider.itIsDangerous()), spider.getMaintenanceCost(), spider.getDangerPercent());
			}
			else if(animals[j].getName().equals("WASP"))
			{
				wasp = new Wasp();
				wasp = (Wasp)animals[j];
				System.out.printf("The animal on position %d is %s, it has"
						+ " %d legs, it is %s that it can fly and it is %s that it's dangerous. It needs"
						+ " %.1f hours of attention. It has a"
						+ " %.2f danger percent. It's %s that"
						+ " the animal has been taken care of \n",j,wasp.getName(),
						wasp.getNumberOfLegs(),String.valueOf(wasp.isFlying()),String.valueOf(wasp.itIsDangerous()), wasp.getMaintenanceCost(), wasp.getDangerPercent(), wasp.getTakenCareOf());
			}
		}
		
		System.out.println();
		Employee employee; // This is used for type-casting to Employee to get the ID number.
		
		/**
		 * The construction of caretakers array. After that, we are printing out their attributes. 
		 */
		
		Caretaker []caretakers = new Caretaker[30];
		for(int j=0;j<caretakers.length;j++)
		{
			Caretaker caretaker = new Caretaker();
			caretakers[j] = caretaker;
		}
		
		
		for(int j=0;j<caretakers.length;j++)
		{
			employee = (Employee)caretakers[j];
			System.out.printf("The %s on pozition %d has a salary of %s,"
					+ " it is %s that he is dead and he's got %.1f working hours."
					+ " He's id number is %d \n",caretakers[j].getName(),
					j, caretakers[j].getSalary().toString(), String.valueOf(caretakers[j].getIfDead()),
					caretakers[j].getWorkingHours(),employee.getId());
		}
		
		System.out.println();
		
		/**
		 * Here we test whether the caretakers have succesfully taken care of animals or not.
		 * We print a message for every case and set the actual takenCareOf state of the animal in case 
		 * of succes.
		 */
		
		GoingThroughCaretakers:
		for(int j=0;j<caretakers.length;j++)
		{
			String result;
			employee = (Employee)caretakers[j];
			for(int k=0;k<animals.length;k++)
			{
				if(employee.getIfDead() == false && animals[k].getTakenCareOf() == false)
				{
					result = caretakers[j].takeCareOf(animals[k]);
					if(result.equals(Constants.Caretakers.TCO_KILLED))
					{
						caretakers[j].setIfDead(true);
						System.out.printf("The %s on pozition %d has been killed by the %s"
								+ " on pozition %d \n", caretakers[j].getName(),
								j,animals[k].getName(),k);
						continue GoingThroughCaretakers;
					}
					else if(result.equals(Constants.Caretakers.TCO_NO_TIME))
					{
						System.out.printf("The %s on pozition %d does not have time for the animal"
								+ " %s on pozition %d."
								+ " Skipping to next animal. \n", caretakers[j].getName(),j, animals[k].getName(),k);
						continue;
					}
					else
					{
						animals[k].setTakenCareOf(true);
						System.out.printf("The %s on pozition %d has succesfully taken care of"
								+ " animal %s on pozition %d. SURVIVED! \n", caretakers[j].getName(),j,animals[k].getName(),k);
						continue GoingThroughCaretakers;
					}
				}
		
			}
		}
	
		/**
		 * We just go through animal array again and check which animal has been taken care of and which
		 * has not been taken care of.
		 */
		
		System.out.println();
		for(int j=0;j<animals.length;j++)
		{
			if(animals[j].getTakenCareOf() == false)
			{
				System.out.printf("The %s on pozition %d HAS NOT BEEN taken care of! \n",animals[j].getName(),j);
			}
			else
			{
				System.out.printf("The %s on pozition %d HAS BEEN taken care of! \n",animals[j].getName(),j);

			}
		}
		
		
		
		System.out.println();
		ArrayList<Animal> aList = new ArrayList<>(); // created a new Animal ArrayList
		
		for(int j=0;j<animals.length;j++)
		{
			aList.add(animals[j]);  // Just added into the ArrayList all the animals that were created in the first part
		}
		
		/**
		 *  Here we test the save() method for the animals created in the AnimalRepository class. As you can see,
		 *  every animal is saved into the Animals.xml file. If you open it with MS Word, you'll see that the info there
		 *  are the same printed out here, in the console. I used a try..catch statement, because save() method warned us
		 *  that it possibly throws FileNotFoundException or XMLStreamException.
		 */
		for(int j=0;j<animals.length;j++)
		{
			try
			{
				AnimalRepository animalRepository = new AnimalRepository();
				animalRepository.save(aList);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("The file does not exist! Please fix this problem!");
			}
			catch(XMLStreamException e)
			{
				System.out.println("XMLStream Exception has occured!");
			}
		}
		
		
		
		/**
		 * Testing the load method. It returns a created ArrayList with the original animals' attributes ( This method
		 * creates inside it new concrete animals, so that's why the ArrayList returned by the load() method contains
		 * animals with the original attributes, untouched. )
		 */
		
		AnimalRepository animalRepository = new AnimalRepository(); // another ArrayList, but this time for loading
		ArrayList<Animal> loadedAList = new ArrayList<Animal>();
		try
		{
			loadedAList = animalRepository.load();
		}
		catch(ParserConfigurationException e)
		{
			System.out.println("An error of type ParserConfigurationException!");
		}
		catch(SAXException e)
		{
			System.out.println("An error of type SAXException!");
		}
		catch(IOException e)
		{
			System.out.println("An error of type IOException1");
		}
		
		for(int j=0;j<loadedAList.size();j++)
		{
			System.out.printf("The animal in the array list on position %d, is: %s \n",j,loadedAList.get(j).getName());
		}
		
		/**
		 * Same thing done with Employees. We create a new Employee ArrayList in which we store the original and processed
		 * employees (caretakers) from the second part of the problem. Then, we test the save() method and observe the same
		 * thing that happened in Animals.xml, in Employees.xml file.
		 */
		
		System.out.println();
		ArrayList<Employee> eList = new ArrayList<Employee>();
		
		for(int j=0;j<caretakers.length;j++)
		{
			eList.add(caretakers[j]);
		}
		
		for(int j=0;j<caretakers.length;j++)
		{
			try
			{
				EmployeeRepository employeeRepository = new EmployeeRepository();
				employeeRepository.save(eList);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("The file does not exist! Please fix this problem!");
			}
			catch(XMLStreamException e)
			{
				System.out.println("XMLStream Exception has occured!");
			}
		}
		
		/**
		 * Testing the load method for employees. Exactly the same as Animals load() method. 
		 */
		
		EmployeeRepository employeeRepository = new EmployeeRepository();
		ArrayList<Employee> loadedEList = new ArrayList<Employee>();
		
		try
		{
			loadedEList = employeeRepository.load();
		}
		catch(ParserConfigurationException e)
		{
			System.out.println("An error of type ParserConfigurationException!");
		}
		catch(SAXException e)
		{
			System.out.println("An error of type SAXException!");
		}
		catch(IOException e)
		{
			System.out.println("An error of type IOException1");
		}
		
		for(int j=0;j<loadedEList.size();j++)
		{
			System.out.printf("The employee in the array list on position %d, is: %s \n",j,loadedEList.get(j).getName());
		}
	}
}
