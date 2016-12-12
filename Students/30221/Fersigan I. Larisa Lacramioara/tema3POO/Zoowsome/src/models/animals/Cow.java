package models.animals;

public class Cow extends Mammal {
	private int nrOfLegs;
	private String name;
	private float normalBodyTemp;
	private float percBodyHair;
	
	public Cow(int nr, String n,float tmp, float hair){
		normalBodyTemp=tmp;
		percBodyHair=hair;
		nrOfLegs=nr;
		name=n;
		}
	public Cow(){
		Cow cowobject= new Cow();
	}
	public void caracteristicipropri(){
		System.out.println("The cow has "  + normalBodyTemp + " normal body temperature");
		System.out.println("The cow has " + percBodyHair+ "% of body covered in hair " );
	}
	public void saying(){
		System.out.println("The cow has "  + nrOfLegs + " legs");
		System.out.println("The cow name is " + name );
	}

}
