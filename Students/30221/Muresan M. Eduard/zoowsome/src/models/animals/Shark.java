package models.animals;

public class Shark extends Aquatic{
	private float biteWidth;
	public Shark()
	{
		super(80, water.saltWater, "Unknown");
		biteWidth = 0;
	}
	public Shark(String name, double biteWidth)
	{
		super(30, water.saltWater, name);
		this.biteWidth = (float)biteWidth;
	}
	public float getBiteWidth()
	{
		return biteWidth;
	}
	public void setBiteWidth(double biteWidth)
	{
		this.biteWidth = (float)biteWidth;
	}
}
