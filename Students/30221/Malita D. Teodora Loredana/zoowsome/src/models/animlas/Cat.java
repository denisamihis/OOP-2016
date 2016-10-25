package models.animlas;

public class Cat extends Mammal {
	private String race;
	public Cat(String name, String race){
		super((float)39.7 ,false,  name,  4);
		this.race=race;
	}
	public Cat()
	{
		super((float)39.7,false,"Unknown",4);
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
