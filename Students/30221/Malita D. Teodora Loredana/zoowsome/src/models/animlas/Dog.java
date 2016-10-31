package models.animlas;

public class Dog extends Mammal {
	private String race;
	public Dog(String name,String race){
		super( (float)39.2 ,false,  name,  4,6.0,0.3);
		this.race=race;
	}
	public Dog()
	{
		super((float)39.2,false,"Unknown",4,6.0,0.3);
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
