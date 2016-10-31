package models.animlas;

public abstract class Insect extends Animal {
	protected boolean fly;
	protected boolean isDangerous;
	public Insect ( String name, int nrOfLegs,boolean fly,boolean isDangerous,double maintenanceCost,double dangPerc){
		super(name,nrOfLegs, maintenanceCost, dangPerc);
		this.fly=fly;
		this.isDangerous=isDangerous;
	}
	public boolean getCanFly()
	{
		return fly;
	}
	public void setCanFly(boolean fly)
	{
		this.fly=fly;
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous=isDangerous;
	}
	

}
