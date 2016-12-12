package javasmmr.zoowsome.models;

public class Dinosaur extends Reptile {
	
	public Dinosaur()
	{
		;
	}
	
	public Dinosaur(String name, boolean answer)
	{
		this.setNumberOfLegs(4);
		this.setName(name);
		this.setLayingEggs(answer);
	}
}