package javasmmr.zoowsome.models;

public class Cockroach extends Insects{
	public Cockroach(){
		setnrlegs(6);
		setname("Cockroach");
		setvenomous(Boolean.FALSE);
	    setcanfly(Boolean.FALSE);
	}
	public Cockroach(int nrlegs, String name, Boolean venomous, Boolean canfly){
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
	    setcanfly(canfly);
	}
}
