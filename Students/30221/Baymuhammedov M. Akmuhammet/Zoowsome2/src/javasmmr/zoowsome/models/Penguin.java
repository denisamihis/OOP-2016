package javasmmr.zoowsome.models;

public class Penguin extends Bird{
   public Penguin(){
	   super(0.4,0.1);
		setnrlegs(2);
		setname("Penguin");
		setflight(0);
	}
	
	public Penguin(int nrlegs, String name, Integer flightability,double maintenance, double danger){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setflight(flightability);
	} 
}
