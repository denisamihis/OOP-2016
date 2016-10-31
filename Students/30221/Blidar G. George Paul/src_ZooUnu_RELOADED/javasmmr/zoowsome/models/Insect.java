package javasmmr.zoowsome.models;

public abstract class Insect extends Animal {
	
	private boolean canFly;
	private boolean isDangerous;
	
	public boolean isFlying()
	{
		return canFly;
	}
	
	public void setIsFlying(boolean answer)
	{
		canFly = answer;
	}
	
	public boolean itIsDangerous()
	{
		return isDangerous;
	}
	
	public void setItIsDangerous(boolean answer)
	{
		isDangerous = answer;
	}
}
