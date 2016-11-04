package javasmmr.zoowsome.models;

public class Chameleon extends Reptiles{
	public Chameleon(){
	super(0.8,0.1);
	setnrlegs(4);
	setname("Chameleon");
	setvenomous(Boolean.FALSE);
	setcanswim(Boolean.FALSE);
	
}
	public Chameleon(int nrlegs, String name, Boolean venomous, Boolean canswim, double maintenance, double danger){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
		setcanswim(canswim);
	}
}
