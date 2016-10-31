package javasmmr.zoowsome.models;

public class Beetle extends Insects{
	public Beetle(){
		setnrlegs(6);
		setname("Beetle");
		setvenomous(Boolean.FALSE);
		setcanfly(Boolean.TRUE);
	}
	
	public Beetle(int nrlegs, String name, Boolean venomous, Boolean canfly){
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
		setcanfly(canfly);
	}

}
