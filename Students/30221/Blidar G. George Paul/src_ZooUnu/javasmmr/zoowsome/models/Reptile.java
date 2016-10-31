package javasmmr.zoowsome.models;

public abstract class Reptile extends Animal {
	
	private boolean laysEggs;
	
	public boolean isLayingEggs()
	{
		return laysEggs;
	}
	
	public void setLayingEggs(boolean answer)
	{
		laysEggs = answer;
	}
	
}