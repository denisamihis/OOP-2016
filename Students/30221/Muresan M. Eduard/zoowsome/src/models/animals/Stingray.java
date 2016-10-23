package models.animals;

public class Stingray extends Aquatic{
	private int stingerLength;
	public Stingray()
	{
		super(80, water.saltWater, "Unknown");
		stingerLength = 0;
	}
	public Stingray(String name, int stingerLength)
	{
		super(80, water.saltWater, name);
		this.stingerLength = stingerLength;
	}
	public int getStingerLength()
	{
		return stingerLength;
	}
	public void setStingerLength(int stingerLength)
	{
		this.stingerLength = stingerLength;
	}
}
