package models.animlas;

public class Dog extends Mammal {
	private String race;
	public Dog(String name, int age,String race){
		super( (float)39.2 ,false, "Canis Lupus Familiaris",  name,  age);
		this.race=race;
	}
	public Dog()
	{
		super((float)39.2,false,"Canis Lupus","Unknown",0);
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
