package javasmmr.zoowsome.models;

public class Lizard extends Reptiles{
    public Lizard(){
    	super(0.2,0.6);
    	setnrlegs(4);
    	setname("Lizard");
    	setvenomous(Boolean.FALSE);
    	setcanswim(Boolean.FALSE);
    }
    
    public Lizard(int nrlegs, String name, Boolean venomous, Boolean canswim,double maintenance, double danger){
    	super(maintenance,danger);
    	setnrlegs(nrlegs);
    	setname(name);
        setvenomous(venomous);
        setcanswim(canswim);
    }
}
