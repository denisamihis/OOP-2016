package models.animals;

public class Snail extends Insect{
	private int shellLength;
	public Snail()
	{
		super(false, false, "Unknown");
		shellLength = 0;
	}
	public Snail(String name, int shellLength)
	{
		super(false, false, name);
		this.shellLength = shellLength;
	}
	public int getShellLength()
	{
		return shellLength;
	}
	public void setShellLength(int shellLength)
	{
		this.shellLength = shellLength;
	}
}
