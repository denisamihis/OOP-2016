package javasmmr.zoowsome.models;

public class Aligator extends Reptile {
	
	public Aligator()
	{
		;
	}
	
	public Aligator(String name, boolean answer)
	{
		this.setNumberOfLegs(4);
		this.setLayingEggs(answer);
		this.setName(name);
	}
}