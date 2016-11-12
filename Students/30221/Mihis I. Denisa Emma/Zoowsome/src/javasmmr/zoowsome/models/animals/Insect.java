package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal{

	private boolean canFly;
	private boolean isDangerous;
	public Insect(String name, int numberOfLegs, boolean canFly, boolean isDangerous) {
		super(name, numberOfLegs);
		setFly(canFly);
		
	}
	public void setFly(boolean canFly)
	{
		 this.canFly=canFly;
		 setDangerous(isDangerous);
	}
	public Boolean getFly(boolean isDangerous)
	{
		 return isDangerous;
	}
	public void setDangerous(boolean isDangerous)
	{
		 this.isDangerous=isDangerous;
	}
	public Boolean getDangerous(boolean isDangerous)
	{
		 return isDangerous;
	}


}
