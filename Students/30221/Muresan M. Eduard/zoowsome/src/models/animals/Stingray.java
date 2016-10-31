package models.animals;

public class Stingray extends Aquatic{
	private int stingerLength;
	public Stingray()
	{
		super(80, water.saltWater, "Unknown", 0, 3.0, 0.6);
		stingerLength = 0;
	}
	public Stingray(String name, int stingerLength)
	{
		super(80, water.saltWater, name, 0, 3.0, 0.6);
		this.stingerLength = stingerLength;
	}
	//true killers
	public int getStingerLength()
	{
		return stingerLength;
	}
	public void setStingerLength(int stingerLength)
	{
		this.stingerLength = stingerLength;
	}
}
