package javasmmr.zoowsome.models.animals;
public abstract class Reptiles extends Animal {
    public boolean laysEggs;
	
    
   public Reptiles(boolean laysEggs,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   super(nrOfLegs,name,maintenanceCost,dangerPerc);
	   this.laysEggs=laysEggs;
   }
    
    
   public void setLaysEggs(boolean laysEggs){
	   this.laysEggs=laysEggs;
   }
   public boolean getLaysEggs(){
	   return laysEggs;
   }
}
