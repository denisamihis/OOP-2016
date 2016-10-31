package models.animals;

public class Aligator extends Reptile{
	private int length;
	public Aligator()
	{
		super(true, "Unknown", 4, 4.0, 0.8);
		this.length = 0;
	}
	public Aligator(String name, int length)
	{
		super(true, name, 4, 4.0, 0.8);
		this.length = length;
	}
	//These are dangerous at all times
	public int getLength()
	{
		return length;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
}
