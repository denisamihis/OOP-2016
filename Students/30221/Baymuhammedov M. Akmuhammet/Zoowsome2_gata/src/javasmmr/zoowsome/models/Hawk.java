package javasmmr.zoowsome.models;

public class Hawk extends Bird{
public Hawk(){
	super(0.4,0.7);
	setnrlegs(2);
	setname("Hawk");
	setflight(10000);
	setTakencareof(Boolean.FALSE);
}

public Hawk(int nrlegs, String name, Integer flightability, double maintenance, double danger,boolean Takencareof){
	super(maintenance,danger);
	setnrlegs(nrlegs);
	setname(name);
	setflight(flightability);
	setTakencareof(Takencareof);
}
}
