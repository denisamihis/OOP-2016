package javasmmr.zoowsome.models;

public class Nightingale extends Bird {
	public Nightingale(){
		setnrlegs(2);
		setname("Nightingale");
		setflight(1000);
	}
	
	public Nightingale(int nrlegs, String name, Integer flightability){
		setnrlegs(nrlegs);
		setname(name);
		setflight(flightability);
	}
}
