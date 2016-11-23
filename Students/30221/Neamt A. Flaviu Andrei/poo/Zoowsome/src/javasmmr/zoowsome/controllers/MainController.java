package javasmmr.zoowsome.controllers;
import java.util.Random;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
public static void main (String[] args) throws Exception{
	AnimalFactory abstractFactory=new AnimalFactory();
	SpeciesFactory speciesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Birds);
	Animal a1=speciesFactory1.getAnimal(Constants.Animals.Birds.Penguin);
	System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
    SpeciesFactory mammal=null;
    SpeciesFactory reptiles=null;
    SpeciesFactory insects=null;
    SpeciesFactory birds=null;
    SpeciesFactory aquaties=null;
    try{
    	mammal= abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
    	insects= abstractFactory.getSpeciesFactory(Constants.Species.Insects);
    	birds= abstractFactory.getSpeciesFactory(Constants.Species.Birds);
    	reptiles= abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
    	aquaties= abstractFactory.getSpeciesFactory(Constants.Species.Aquaties);
    }
    catch(Exception e)
    {
    	System.out.println("Ivalid Species");
    }
    Random r=new Random();
    Animal v[]=new Animal[100];
    for(int c=0;c<100;c++)
    {
    	switch(r.nextInt(5))
    	{
    	case 0:
    		switch(r.nextInt(3))
    		{
    		case 0:
    			v[c]=mammal.getAnimal(Constants.Animals.Mammals.Bear);
    			break;
    		case 1:
    			v[c]=mammal.getAnimal(Constants.Animals.Mammals.Cow);
    			break;
    		case 2:
    			v[c]=mammal.getAnimal(Constants.Animals.Mammals.Platypus);
    			break;
    		}
    		break;
    	case 1:
    		switch(r.nextInt(3))
    		{
    		case 0:
    			v[c]=reptiles.getAnimal(Constants.Animals.Reptiles.Lizard);
    			break;
    		case 1:
    			v[c]=reptiles.getAnimal(Constants.Animals.Reptiles.Salamander);
    			break;
    		case 2:
    			v[c]=reptiles.getAnimal(Constants.Animals.Reptiles.Turtle);
    			break;
    		}
    		break;
    	case 2:
    		switch(r.nextInt(3))
    		{
    		case 0:
    			v[c]=birds.getAnimal(Constants.Animals.Birds.Dodo);
    			break;
    		case 1:
    			v[c]=birds.getAnimal(Constants.Animals.Birds.Flamingo);
    			break;
    		case 2:
    			v[c]=birds.getAnimal(Constants.Animals.Birds.Penguin);
    			break;
    		}
    		break;
    	case 3:
    		switch(r.nextInt(3))
    		{
    		case 0:
    			v[c]=aquaties.getAnimal(Constants.Animals.Aquaties.Salmon);
    			break;
    		case 1:
    			v[c]=aquaties.getAnimal(Constants.Animals.Aquaties.Shark);
    			break;
    		case 2:
    			v[c]=aquaties.getAnimal(Constants.Animals.Aquaties.Shrimp);
    			break;
    		}
    		break;
    	case 4:
    		switch(r.nextInt(3))
    		{
    		case 0:
    			v[c]=insects.getAnimal(Constants.Animals.Insects.Ant);
    			break;
    		case 1:
    			v[c]=insects.getAnimal(Constants.Animals.Insects.Butterfly);
    			break;
    		case 2:
    			v[c]=insects.getAnimal(Constants.Animals.Insects.Caterpillar);
    			break;
    		}
    		break;
    	}
    }
    Caretaker empl[]= new Caretaker[300];
    AbstractEmployeeFactory emplfac=new AbstractEmployeeFactory();
    EmployeeFactory carefac=null;
    carefac=emplfac.getEmployee(Constants.Employees.Caretaker);
    for(int c=0;c<300;c++)
    {
    	empl[c]=(Caretaker) carefac.getEmployee();
    }
    String result;
    for(Caretaker c:empl)
    {
    	for(Animal a:v)
    	{
    		if(!c.isDead && !a.takenCareOf)
    		{
    			result=c.takeCareOf(a);
    			if(result.equals(Constants.Employees.Caretakers.TCO_KILLED))
    			{
    				c.isDead=true;
    			}
    			else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME))
    				continue;
    		}
    		
    	}
    }
    int nrDead=0;
    for(Caretaker c:empl)
    	if(c.isDead)
    		nrDead++;
    int nrCare=0;
    for(Animal a:v)
    	if(a.takenCareOf)
    		nrCare++;
    System.out.println(nrDead+" employees died and "+ nrCare+" animals have been taken care of");
}

}