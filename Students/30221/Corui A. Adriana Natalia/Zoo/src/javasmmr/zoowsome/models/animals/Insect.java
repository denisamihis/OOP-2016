package javasmmr.zoowsome.models.animals;

public class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;
	public boolean getFlyAbility()
	{
		return canFly;
	}
	public void setFlyAbility(boolean canFly)
	{
		this.canFly=canFly;
	}
	public boolean getDangerLvl()
	{
		return isDangerous;
	}
	public void setDangerLvl(boolean isDangerous)
	{
		this.isDangerous=isDangerous;
	}
}
