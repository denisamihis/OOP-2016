package models.animals;

public class StagBeetle extends Insect{
	private int jawsLength;
	public StagBeetle()
	{
		super(true, false, "Unknown");
		jawsLength = 0;
	}
	public StagBeetle(String name, int jawsLength)
	{
		super(true, false, name);
		this.jawsLength = jawsLength;
	}
	public int getJawsLength()
	{
		return jawsLength;
	}
	public void setJawsLength(int jawsLength)
	{
		this.jawsLength = jawsLength;
	}
}
