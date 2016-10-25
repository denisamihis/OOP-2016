package models.animals;

public class Monkey extends Mammal {
	private int nrOfLegs;
	private String name;
	private float normalBodyTemp;
	private float percBodyHair;
	
	public Monkey(int nr, String n,float tmp, float hair){
		normalBodyTemp=tmp;
		percBodyHair=hair;
		nrOfLegs=nr;
		name=n;
		}
	public Monkey(){
		Monkey monkeyobject= new Monkey();
	}
	public void caracteristicipropri(){
		System.out.println("The monkey has "  + normalBodyTemp + " normal body temperature");
		System.out.println("The monkey has " + percBodyHair+ "% of body covered in hair " );
	}
	public void saying(){
		System.out.println("The monkey has "  + nrOfLegs + " legs");
		System.out.println("The monkey name is " + name );
	}

}
