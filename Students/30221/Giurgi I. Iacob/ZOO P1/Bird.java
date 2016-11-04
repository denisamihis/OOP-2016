package javasmmr.zoowsome.models.animals;
public abstract class Bird extends Animal {
   public boolean migrates;
   public int avgFlightAltitude;
   
   public void setMigrates(boolean migrates){
	   this.migrates=migrates;
   }
   
   public void setAvgFlightAltitude(int average){
	   this.avgFlightAltitude=average;
   }
   
   public boolean getMigrates(){
	   return migrates;
   }
   
   public int getAvgFlightAltitude(){
	   return avgFlightAltitude;
   }
   
}
