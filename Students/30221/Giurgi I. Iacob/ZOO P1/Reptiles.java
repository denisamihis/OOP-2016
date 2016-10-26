package javasmmr.zoowsome.models.animals;
public abstract class Reptiles extends Animal {
    public boolean laysEggs;
	
   public void setLaysEggs(boolean laysEggs){
	   this.laysEggs=laysEggs;
   }
   public boolean getLaysEggs(){
	   return laysEggs;
   }
}
