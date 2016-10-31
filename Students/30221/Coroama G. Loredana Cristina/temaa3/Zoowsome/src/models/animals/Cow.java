package models.animals;

public class Cow extends Mammal {
	int NrLegs=4;
	String name;
	 float normalBodyTemp;
	 float percBodyHair;
	
	public Cow(int Nr, String C, float temp, float hair)
	{
		NrLegs=Nr;
		name=C;
		normalBodyTemp=temp;
		percBodyHair=hair;
		
	}
	public Cow(){
		Cow cowobject= new Cow();
	}
public void saying()
{
System.out.println("Mammal/Cow ");
	
	System.out.println("the name is "+name);
	System.out.println("no of legs is  "+ NrLegs);
	System.out.println("NormalBodyTemperature "+normalBodyTemp);
	System.out.println("PercBodyHair  "+percBodyHair);

}
}
