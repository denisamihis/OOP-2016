package javasmmr.zoowsome.models;

public class Chameleon extends Reptiles{
	public Chameleon(){
	setnrlegs(4);
	setname("Chameleon");
	setvenomous(Boolean.FALSE);
	setcanswim(Boolean.FALSE);
	
}
	public Chameleon(int nrlegs, String name, Boolean venomous, Boolean canswim){
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
		setcanswim(canswim);
	}
}
