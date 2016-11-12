package javasmmr.zoowsome.models;

public class Penguin extends Bird{
   public Penguin(){
	   super(0.4,0.1);
		setnrlegs(2);
		setname("Penguin");
		setflight(0);
		setTakencareof(Boolean.FALSE);
	}
	
	public Penguin(int nrlegs, String name, Integer flightability,double maintenance, double danger,boolean Takencareof){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setflight(flightability);
		setTakencareof(Takencareof);
	} 
}
