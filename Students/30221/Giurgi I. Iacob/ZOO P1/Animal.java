package javasmmr.zoowsome.models.animals;

public abstract class Animal {
   private int nrOfLegs;
   protected String name;
   
   public void setNrOfLegs(int nrOfLegs){
	   this.nrOfLegs=nrOfLegs;
   }
   
   public void setName(String name) {
       this.name = name;
    }
   
   public int getNrOfLegs () {
		return nrOfLegs;
   }
		
   public String getName () {
			return name;	
   }
}


