package javasmmr.zoowsome.models;

public class Ant extends Insects{
   public Ant(){
	   super(0.5, 0.1);
	   setnrlegs(6);
	   setname("Ant");
	   setvenomous(Boolean.FALSE);
	   setcanfly(Boolean.FALSE);
	   setTakencareof(Boolean.FALSE);
	   
   }
   
   public Ant(int nrlegs, String name, Boolean venomous, Boolean canfly, Double maintenance, Double danger,Boolean Takencareof){
	   super(maintenance, danger);
	   setnrlegs(nrlegs);
	   setname(name);
	   setvenomous(venomous);
	   setcanfly(canfly);
	   setTakencareof(Takencareof);
   }
}
