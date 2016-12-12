package javasmmr.zoowsome.models;

public class Lizard extends Reptiles{
    public Lizard(){
    	setnrlegs(4);
    	setname("Lizard");
    	setvenomous(Boolean.FALSE);
    	setcanswim(Boolean.FALSE);
    }
    
    public Lizard(int nrlegs, String name, Boolean venomous, Boolean canswim){
    	setnrlegs(nrlegs);
    	setname(name);
        setvenomous(venomous);
        setcanswim(canswim);
    }
}
