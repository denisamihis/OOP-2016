package javasmmr.zoowsome.models;

public class Aligator extends Reptile {
	
	public Aligator()
	{
		this("ALIGATOR",true);
	}
	
	public Aligator(String name, boolean answer)
	{
		this.setNumberOfLegs(4);
		this.setLayingEggs(answer);
		this.setName(name);
		
	}
}