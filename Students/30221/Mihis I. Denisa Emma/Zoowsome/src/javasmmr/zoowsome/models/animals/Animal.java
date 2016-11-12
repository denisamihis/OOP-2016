package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private int numberOfLegs;
	private String name;
	public Animal(String name, int numberOfLegs)
	{
		setName(name);
		setNumberOfLegs(numberOfLegs);
	}
	public  void setName(String name)
	{
		this.name=name;
	}
	public void setNumberOfLegs(int numberOfLegs)
	{
		 this.numberOfLegs=numberOfLegs;
	}
	public  String getName(String name)
	{
		return name;
	}
	public int getNumberOfLegs(int numberOfLegs)
	{
		 return numberOfLegs;
	}
}
