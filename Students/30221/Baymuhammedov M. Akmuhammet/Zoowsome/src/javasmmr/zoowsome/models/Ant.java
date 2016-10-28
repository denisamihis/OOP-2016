package javasmmr.zoowsome.models;

public class Ant extends Insects{
   public Ant(){
	   setnrlegs(6);
	   setname("Ant");
	   setvenomous(Boolean.FALSE);
	   setcanfly(Boolean.FALSE);
   }
   
   public Ant(int nrlegs, String name, Boolean venomous, Boolean canfly){
	   setnrlegs(nrlegs);
	   setname(name);
	   setvenomous(venomous);
	   setcanfly(canfly);
   }
}
