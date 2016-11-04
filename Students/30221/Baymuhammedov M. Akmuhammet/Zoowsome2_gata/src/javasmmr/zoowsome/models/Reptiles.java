package javasmmr.zoowsome.models;

public abstract class Reptiles extends Animals{
   private Boolean venomous;
   private Boolean canswim;
   public Reptiles(double maintenance, double danger){
	   super(maintenance, danger);
   }
   
   public void venomous(){
	   System.out.println("Venomous: "+venomous);
   }
   
   public void setvenomous(Boolean venom){
	   this.venomous=venom;
   }
   
   public void canswim(){
	   System.out.println("Can swim: "+canswim);
   }
   
   public void setcanswim(Boolean swim){
	   this.canswim=swim;
   }
}
