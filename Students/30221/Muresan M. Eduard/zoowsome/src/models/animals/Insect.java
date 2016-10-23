package models.animals;

public abstract class Insect extends Animal{
	protected boolean canFly;
	protected boolean isDangerous;
	public Insect(boolean canFly, boolean isDangerous, String name)
	{
		super(name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	public boolean getCanFly()
	{
		return canFly;
	}
	public void setCanFly(boolean canFly)
	{
		this.canFly = canFly;
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
}
