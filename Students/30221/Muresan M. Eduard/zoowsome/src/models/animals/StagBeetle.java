package models.animals;

public class StagBeetle extends Insect{
	private int jawsLength;
	public StagBeetle()
	{
		super(true, false, "Unknown", 6, 0.5, 0.1);
		jawsLength = 0;
	}
	public StagBeetle(String name, int jawsLength)
	{
		super(true, false, name, 6, 0.5, 0.1);
		this.jawsLength = jawsLength;
	}
	// They don't realy care about time and date :)
	public int getJawsLength()
	{
		return jawsLength;
	}
	public void setJawsLength(int jawsLength)
	{
		this.jawsLength = jawsLength;
	}
}
