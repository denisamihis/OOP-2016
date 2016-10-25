package models.animals;

public class Tiger extends Mammal{
	int NrLegs=4;
	String name;
	 float normalBodyTemp;
	 float percBodyHair;
	
	public Tiger(int Nr, String C, float temp, float hair)
	{
		NrLegs=Nr;
		name=C;
		normalBodyTemp=temp;
		percBodyHair=hair;
		
	}
	public Tiger(){
		Tiger tigerobject= new Tiger();
	}
public void saying()
{
	System.out.println("Mammal/Tiger ");
	
	System.out.println("the name is "+name);
	System.out.println("no of legs is  "+ NrLegs);
	System.out.println("NormalBodyTemperature "+normalBodyTemp);
	System.out.println("PercBodyHair  "+percBodyHair);

}
}
