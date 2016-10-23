package models.animlas;

public class Cat extends Mammal {
	private String race;
	public Cat(String name, int age, String race){
		super((float)39.7 ,false, "Felis catus ",  name,  age);
		this.race=race;
	}
	public Cat()
	{
		super((float)39.7,false,"Felis catus","Unknown",0);
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
