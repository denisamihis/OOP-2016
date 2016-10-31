package javasmmr.zoowsome.models;

public class Hawk extends Bird{
public Hawk(){
	setnrlegs(2);
	setname("Nightingale");
	setflight(10000);
}

public Hawk(int nrlegs, String name, Integer flightability){
	setnrlegs(nrlegs);
	setname(name);
	setflight(flightability);
}
}
