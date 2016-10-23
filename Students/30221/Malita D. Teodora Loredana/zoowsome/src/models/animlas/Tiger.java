package models.animlas;

public class Tiger extends Mammal{
	private String race;
	public Tiger(String name, int age, String race){
		super((float)37.5, true,"Panthera tigris",name,age);
		this.race=race;
	}
	public Tiger()
	{
		super((float)37.5,false,"Felis catus","Unknown",0);
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
