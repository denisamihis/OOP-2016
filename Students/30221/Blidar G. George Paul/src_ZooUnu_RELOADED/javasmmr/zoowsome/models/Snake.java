package javasmmr.zoowsome.models;

public class Snake extends Reptile {
	
	public Snake()
	{
		this("SNAKE",true);
	}
	
	public Snake(String name, boolean answer)
	{
		this.setNumberOfLegs(0);
		this.setName(name);
		this.setLayingEggs(answer);
	}
}