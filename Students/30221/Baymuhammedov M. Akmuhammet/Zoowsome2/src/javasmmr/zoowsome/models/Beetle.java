package javasmmr.zoowsome.models;

public class Beetle extends Insects{
	public Beetle(){
		super(0.3,0.2);
		setnrlegs(6);
		setname("Beetle");
		setvenomous(Boolean.FALSE);
		setcanfly(Boolean.TRUE);
	}
	
	public Beetle(int nrlegs, String name, Boolean venomous, Boolean canfly, double maintenance, double danger){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
		setcanfly(canfly);
	}
}
