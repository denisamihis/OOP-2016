package javasmmr.zoowsome.models.animals;
public abstract class Bird extends Animal {
   public boolean migrates;
   public int avgFlightAltitude;
   
   public Bird(boolean migrates,int average,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   super(nrOfLegs,name,maintenanceCost,dangerPerc);
	   this.migrates=migrates;
	   this.avgFlightAltitude=average;
	   
   }
   
   public boolean getMigrates(){
	   return migrates;
   }
   
   public int getAvgFlightAltitude(){
	   return avgFlightAltitude;
   }
   
}
