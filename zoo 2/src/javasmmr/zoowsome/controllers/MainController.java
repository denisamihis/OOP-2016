package javasmmr.zoowsome.controllers;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoosome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;


public class MainController {

	public static void main(String[] args) throws Exception  {
		
		Random random=new Random();
	  
		String[] species={"Mammals","Reptiles","Insects","Birds","Aquatics"};
		String[][] animals={{"Lion","Tiger","Panther"},{"Chameleon","Lizard","Snake"},
				            {"Bee","Bug","Butterfly"},{"Eagle","Parrot","Tucan"},
				            {"Dolphin","Octopus","Shark"}};
		
		
		for(int i=0;i<5;i++){
			Caretaker care= new Caretaker();
			
	     for(int j=0;j<10;j++){
	    	 int randomSpecies=random.nextInt(5);
	    	 int randomAnimal=random.nextInt(3);
	    	
	    	 
	     AnimalFactory aFactory=new AnimalFactory();
	     SpeciesFactory sFactory=aFactory.getSpeciesFactory(species[randomSpecies]);
	     Animal a=sFactory.getAnimal(animals[randomSpecies][randomAnimal]);	 
	     
	     
	              
	       
	     
	     System.out.println(a.getName());
	     
	     String result;
	     
	     if(care.getIsDead()==false&&a.getTakenCareOf()==false)
	     {
	    	 result=care.takeCareOf(a);
	    	 if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
	    		 care.setIsDead(true);
	    	 }
	    	 else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
	    		 
	    		 a.setTakenCareOf(false);
	    	 }
	    	 else {
	    		 a.setTakenCareOf(true);
	    	 }
	     }
	     
	      if(a.getTakenCareOf()==true)
	     System.out.println(" Was taken care of");
	      else
	     System.out.println(" Wasn't taken care of");
	     
	     }

	}
	
	}
	
	}

