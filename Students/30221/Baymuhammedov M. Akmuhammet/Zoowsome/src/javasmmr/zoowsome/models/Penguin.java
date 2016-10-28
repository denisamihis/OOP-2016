package javasmmr.zoowsome.models;

public class Penguin extends Bird{
   public Penguin(){
		setnrlegs(2);
		setname("Nightingale");
		setflight(0);
	}
	
	public Penguin(int nrlegs, String name, Integer flightability){
		setnrlegs(nrlegs);
		setname(name);
		setflight(flightability);
	} 
}
