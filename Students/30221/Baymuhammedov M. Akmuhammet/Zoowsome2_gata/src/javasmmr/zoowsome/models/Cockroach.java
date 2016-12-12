package javasmmr.zoowsome.models;

public class Cockroach extends Insects{
	public Cockroach(){
		super(0.2,0.0);
		setnrlegs(6);
		setname("Cockroach");
		setvenomous(Boolean.FALSE);
	    setcanfly(Boolean.FALSE);
	    setTakencareof(Boolean.FALSE);
	}
	public Cockroach(int nrlegs, String name, Boolean venomous, Boolean canfly, double maintenance, double danger, boolean Takencareof){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
	    setcanfly(canfly);
	    setTakencareof(Takencareof);
	}
}
