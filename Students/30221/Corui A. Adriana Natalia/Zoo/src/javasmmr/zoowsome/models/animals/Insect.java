package javasmmr.zoowsome.models.animals;

public class Insect extends Animal {

	public Insect(double maintCosts,double precDanger) {
		super(maintCosts,precDanger);
		// TODO Auto-generated constructor stub
	}
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
