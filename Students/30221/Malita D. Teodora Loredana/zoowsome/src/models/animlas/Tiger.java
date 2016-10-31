package models.animlas;

public class Tiger extends Mammal{
	private String race;
	public Tiger(String name, String race){
		super((float)37.5, true,name,4,4.7,0.95);
		this.race=race;
	}
	public Tiger()
	{
		super((float)37.5,false,"Unknown",4,4.7,0.95);
		this.race="Unknown";
	}
	public String getRace()
	{
		return race;
	}
	public void setRace(String race)
	{
		this.race=race;
	}
}
