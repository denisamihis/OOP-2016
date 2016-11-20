package javasmmr.zoowsome.controllers;
import java.math.BigDecimal;
import java.util.Random;


import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bee;
import javasmmr.zoowsome.models.animals.Bug;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Lion;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Panther;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Tucan;
import javasmmr.zoosome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;


public class MainController {

	public static void main(String[] args) throws Exception  {
		
		Random random=new Random();
		
		AnimalFactory abstractFactory= new AnimalFactory();
		SpeciesFactory mammalFactory=abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory aquaticFactory= abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory birdFactory=abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory reptileFactory= abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory insectFactory= abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		 int nrAnimal=10;
	  Animal[] animal=new Animal[nrAnimal];
		
		String[] animals={"Lion","Tiger","Panther","Chameleon","Lizard","Snake",
				            "Bee","Bug","Butterfly","Eagle","Parrot","Tucan",
				            "Dolphin","Octopus","Shark"};
		
		
		
		
			
	     for(int i=0;i<nrAnimal;i++){
	    	
	    	 int random1=random.nextInt(14)+1;
	    	
	    
	     String randomAnimal=animals[random1];
	      
	     switch(randomAnimal){
	    
	     case "Lion":{
	    	 animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Lion);
	    	 
	    		 System.out.println(animal[i].getName() + "; " + animal[i].getNrOfLegs() + " legs; " +
	    			 	        
	    			            ((Lion)animal[i]).getNormalBodyTemp() + " degrees body temp; " + 
	                            ((Lion)animal[i]).getPercBodyHair() + " % hair \n" );
	    		
	    	 	break;
         }
	     
	     case "Tiger":{
	    	 animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
	    	 
    		 System.out.println(animal[i].getName() + "; " + animal[i].getNrOfLegs() + " legs; " +
    			 	        
    			            ((Tiger)animal[i]).getNormalBodyTemp() + " degrees body temp; " + 
                            ((Tiger)animal[i]).getPercBodyHair() + " % hair \n" );
	    		
	    	 	break;
         }
	     
	     case "Panther":{
	    	 animal[i]=mammalFactory.getAnimal(Constants.Animals.Mammals.Panther);
	    	 
    		 System.out.println(animal[i].getName() + "; " + animal[i].getNrOfLegs() + " legs; " +
    			 	        
    			            ((Panther)animal[i]).getNormalBodyTemp() + " degrees body temp; " + 
                            ((Panther)animal[i]).getPercBodyHair() + " % hair \n" );
	    	 	break;
         }
	     
	 
	     case "Lizard":{
	    	 animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Lizard);
	    	 System.out.println(animal[i].getName() +  "; lay eggs:" +
	    			 
	                      ((Lizard)animal[i]).getLayEggs() +  " \n" );
	    		
	    	 	break;
         }
	     case "Chameleon":{
	    	 animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Chameleon);
	    	 System.out.println(animal[i].getName() +  "; lay eggs:" +
	    			 
	                      ((Chameleon)animal[i]).getLayEggs() +  " \n" );
	    		
	    		
	    	 	break;
         }
	    
	     case "Snake":{
	    	 animal[i]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Snake);
	    	 System.out.println(animal[i].getName() +  "; lay eggs:" +
	    			 
	                      ((Snake)animal[i]).getLayEggs() +  " \n" );
	    		
	    	 	break;
         }
	     
	
	     case "Bee":{
	    	 animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Bee);
	    	 System.out.println(animal[i].getName() +  "; " +
	    			    
	    			            ((Bee)animal[i]).getdangerPerc()*100 + "; % dangerous  can fly: " + 
	                            ((Bee)animal[i]).getCanFly() +  "  \n" );
	    		
	    	 	break;
         }
	     
	     case "Bug":{
	    	 animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Bug);
	    	 System.out.println(animal[i].getName() +  "; " +
	    			    
	    			            ((Bug)animal[i]).getdangerPerc()*100 + "; % dangerous  can fly: " + 
	                            ((Bug)animal[i]).getCanFly() +  "  \n" );
	    	 	break;
         }
	     
	     case "Butterfly":{
	    	 animal[i]=insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
	    	 System.out.println(animal[i].getName() +  "; " +
	    			    
	    			            ((Butterfly)animal[i]).getdangerPerc()*100 + "; % dangerous  can fly: " + 
	                            ((Butterfly)animal[i]).getCanFly() +  "  \n" );
	    	 	break;
         }
	    
	     case "Eagle":{
	    	 animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Eagle);
	    	 System.out.println(animal[i].getName() +  "; " + animal[i].getNrOfLegs() + "; legs fligth altitude " +
	    			 
	    			            ((Eagle)animal[i]).getAvgFligthAltitude() + "; migrate:" +
	                            ((Eagle)animal[i]).getMigrates() +  "  \n" );
	    		
	    	 	break;
         }
	    
	     case "Parrot":{
	    	 animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Parrot);
	    	 System.out.println(animal[i].getName() +  "; " + animal[i].getNrOfLegs() + " legs; fligth altitude " +
	    		
	    			            ((Parrot)animal[i]).getAvgFligthAltitude() + "; migrate:" +
	                            ((Parrot)animal[i]).getMigrates() +  "  \n" );
	    		
	    	 	break;
         }
	     
	     case "Tucan":{
	    	 animal[i]=birdFactory.getAnimal(Constants.Animals.Birds.Tucan);
	    	 System.out.println(animal[i].getName() +  "; " + animal[i].getNrOfLegs() + " legs; fligth altitude " +
	    			
	    			            ((Tucan)animal[i]).getAvgFligthAltitude() + "; migrate:" +
	                            ((Tucan)animal[i]).getMigrates() +  "  \n" );
	    		
	    	 	break;
         }
	    
	     
	     case "Dolphin":{
	    	 animal[i]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);
	    	 System.out.println(animal[i].getName() + ";  avrage swim depth " +
	    			
	    			            ((Dolphin)animal[i]).getAvgSwimDepth() + "; swim in " +
	                            ((Dolphin)animal[i]).getWaterType() +  "  \n" );
	    		
	    	 	break;
         }
	     
	     case "Octopus":{
	    	 animal[i]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Octopus);
	    	 System.out.println(animal[i].getName() + "; avrage swim depth " +
	    			
	    			            ((Octopus)animal[i]).getAvgSwimDepth() + "; swim in " +
	                            ((Octopus)animal[i]).getWaterType() +  "  \n" );
	    		
	    	 	break;
         }
	     
	     case "Shark":{
	    	 animal[i]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Shark);
	    	 System.out.println(animal[i].getName() +  ";  avrage swim depth " +
	    			
	    			            ((Shark)animal[i]).getAvgSwimDepth() + "; swim in " +
	                            ((Shark)animal[i]).getWaterType() +  "  \n" );
	    		
	    	 	break;
         }
	     default: System.out.println("Animal dose not exist");
	     
	     }
	     
	     Caretaker[] care=new Caretaker[4];
	        care[0]= new Caretaker("The boss",1232,BigDecimal.valueOf(400.0),false);
			care[1]= new Caretaker("First caretaker", 1234 , BigDecimal.valueOf(310.50),false);
			care[2]=new Caretaker("Second caretaker", 1235, BigDecimal.valueOf(320.0), false);
			care[0].setWorkingHouers(4);
			care[1].setWorkingHouers(6);
			care[2].setWorkingHouers(8);
			
			for (Caretaker c: care){
				for(Animal a: animal){
					if ( c.getIsDead()==false && a.getTakenCareOf()==false)
					{
						String result=c.takeCareOf(a);
						if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
							c.setIsDead(true);
							System.out.println("This man died tragicaly ");
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
			
			for(Animal a:animal){
				if(a.getTakenCareOf()==false)
					System.out.println(" Was not taken care of ");
				else
					System.out.println(" Was taken care of ");
			}

	}
	
	}
	
	}
	

