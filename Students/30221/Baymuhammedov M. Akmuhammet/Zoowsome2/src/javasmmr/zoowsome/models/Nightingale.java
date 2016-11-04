package javasmmr.zoowsome.models;

public class Nightingale extends Bird {
	public Nightingale(){
		super(0.2,0.0);
		setnrlegs(2);
		setname("Nightingale");
		setflight(1000);
	}
	
	public Nightingale(int nrlegs, String name, Integer flightability,double maintenance,double danger){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setflight(flightability);
	}
}
