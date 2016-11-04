package javasmmr.zoowsome.models;

public class Snake extends Reptiles{
     public Snake(){
    	 super(0.2,0.9);
    	 setnrlegs(0);
    	 setname("Snake");
    	 setvenomous(Boolean.TRUE);
    	 setcanswim(Boolean.TRUE);
     }
     
     public Snake(int nrlegs, String name, Boolean venomous, Boolean canswim,double maintenance, double danger){
    	 super(maintenance, danger);
    	 setnrlegs(nrlegs);
    	 setname(name);
    	 setvenomous(venomous);
    	 setcanswim(canswim);
     }
}
