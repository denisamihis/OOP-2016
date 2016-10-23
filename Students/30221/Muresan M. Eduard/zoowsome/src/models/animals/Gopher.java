package models.animals;

public class Gopher extends Mammal{
	private String shape;
	public Gopher()
	{
		super(37, 0.99, "Unknown");
		shape = "Gopher shape";
	}
	public Gopher(String name)
	{
		super(37, 0.99, name);
		shape = "Gopher shape";
	}
	public String getShape()
	{
		return shape;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
}
