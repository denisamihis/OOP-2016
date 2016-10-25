package models.animals;

public class Tiger extends Mammal{

	private int nrOfLegs;
	private String name;
	private float normalBodyTemp;
	private float percBodyHair;
	
	public Tiger(int nr, String n,float tmp, float hair){
		normalBodyTemp=tmp;
		percBodyHair=hair;
		nrOfLegs=nr;
		name=n;
		}
	public Tiger(){
		Tiger tigerobject= new Tiger();
	}
	public void caracteristicipropri(){
		System.out.println("The tiger has "  + normalBodyTemp + " normal body temperature");
		System.out.println("The tiger has " + percBodyHair+ "% of body covered in hair " );
	}
	public void saying(){
		System.out.println("The tiger has "  + nrOfLegs + " legs");
		System.out.println("The tiger name is " + name );
	}
}
