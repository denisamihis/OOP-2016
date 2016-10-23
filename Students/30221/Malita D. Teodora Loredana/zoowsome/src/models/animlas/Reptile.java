package models.animlas;

public abstract class Reptile extends Animal {
	protected boolean isUgly;
	public Reptile(boolean isUgly,String scientificName, String name, int age)
	{
		super(scientificName,name,age);
		this.isUgly = isUgly;
	}
	public boolean getisUgly()
	{
		return isUgly;
	}
	public void setisUgly( boolean isUgly)
	{
		this.isUgly=isUgly;
	}
	

}
