package models.animals;

public class Monkey extends Mammal {
	int NrLegs=4;
	String name;
	 float normalBodyTemp;
	 float percBodyHair;
	
	public Monkey(int Nr, String C, float temp, float hair)
	{
		NrLegs=Nr;
		name=C;
		normalBodyTemp=temp;
		percBodyHair=hair;
		
	}
	public Monkey(){
		Monkey monkeyobject= new Monkey();
	}
public void saying()
{
System.out.println("Mammal/Monkey ");
	
	System.out.println("the name is "+name);
	System.out.println("no of legs is  "+ NrLegs);
	System.out.println("NormalBodyTemperature "+normalBodyTemp);
	System.out.println("PercBodyHair  "+percBodyHair);

}
}


