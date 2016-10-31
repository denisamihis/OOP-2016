package javasmmr.zoowsome.models;

public class Snake extends Reptiles{
     public Snake(){
    	 setnrlegs(0);
    	 setname("Snake");
    	 setvenomous(Boolean.TRUE);
    	 setcanswim(Boolean.TRUE);
     }
     
     public Snake(int nrlegs, String name, Boolean venomous, Boolean canswim){
    	 setnrlegs(nrlegs);
    	 setname(name);
    	 setvenomous(venomous);
    	 setcanswim(canswim);
     }
}
