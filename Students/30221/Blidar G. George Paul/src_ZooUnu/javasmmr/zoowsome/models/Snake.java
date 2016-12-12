package javasmmr.zoowsome.models;

public class Snake extends Reptile {
	
	public Snake()
	{
		;
	}
	
	public Snake(String name, boolean answer)
	{
		this.setNumberOfLegs(0);
		this.setName(name);
		this.setLayingEggs(answer);
	}
}