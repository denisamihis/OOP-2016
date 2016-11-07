package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer{
	
		protected int nrOfLegs;
		protected String name;
		protected final double maintenanceCost;
		protected final double dangerPerc;
		protected boolean takenCareOf;
		
		public Animal (double maintenanceCost, double dangerPerc){
			this.maintenanceCost=maintenanceCost;
			this.dangerPerc=dangerPerc + getPredisposition();
			takenCareOf=false;
		}
		
		public int getNrOfLegs () {
			return nrOfLegs;
		}
		
		public void setNrOfLegs (int nrOfLegs) {
			this.nrOfLegs = nrOfLegs;
		}
		
		public String getName () {
			return name;
		}
		
		public void setName (String name) {
			this.name=name;
		}
		
		public boolean getTakenCareOf(){
			return takenCareOf;
		}
		
		public void setTakenCareOf(boolean takenCareOf){
			this.takenCareOf=takenCareOf;
		}
		
		public double getMaintenanceCost() {
			return maintenanceCost;
		}
		
		
		
		//Killer Interface Methods
		
		public boolean kill(){
			Random random = new Random ();
			double generatedNr = random.nextDouble();
			if(generatedNr < dangerPerc){
				return true;
			}
			return false;
			
		}
		
		public double getPredisposition(){
			return 0.0;
		}
		
		

}
