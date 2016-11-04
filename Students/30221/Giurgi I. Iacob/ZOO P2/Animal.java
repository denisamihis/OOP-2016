package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {
   private int nrOfLegs;
   protected String name;
   protected final double maintenanceCost;
   protected final double dangerPerc;
   protected boolean takenCareof;
   
   
   public Animal(int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   
	   this.nrOfLegs=nrOfLegs;
	   this.name = name;
	   this.maintenanceCost=maintenanceCost;
	   this.dangerPerc=dangerPerc;
	   takenCareof=false;
   }
   
   public boolean kill(){
	   Random kill= new Random();
	   double number=kill.nextDouble();
	   if(number < dangerPerc)
		   return true;
	   else return false;
   }
   
   public double getPredisposition(){
	   return 0.0;
   }
   
   public void setTakenCareOf(boolean Take){
	   this.takenCareof=Take;
   }
   
   public boolean getTakenCareOf(){
	   return takenCareof;
   }
   public int getNrOfLegs () {
		return nrOfLegs;
   }
		
   public String getName () {
			return name;	
   }
   
   public double getMaintenanceCost()
   	{
   		return maintenanceCost;
   	}
   public double getDangerPerc()
   { return dangerPerc;   }
}


