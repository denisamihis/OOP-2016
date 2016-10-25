package models.animals;

public class Cockroach extends Insect {

	private int nrOfLegs;
	private String name;
	public boolean canFly;		
	public boolean isDangerous;
	
	public Cockroach(int nr, String n, boolean fly, boolean danger){
		nrOfLegs=nr;
		name=n;
		canFly=fly;
		isDangerous=danger;
	}
	public Cockroach(){
		Cockroach cockroachobject= new Cockroach();
	}
	public void caracteristicipropri(){
		System.out.println("The cockroach  " + ((canFly==true) ? "can fly":"can't fly"));
		System.out.println("The cockroach" + ((isDangerous==true) ?  "is dangerous ":"isn't dangerous" ));
	}
	public void saying(){
		System.out.println("The cockroach has "  + nrOfLegs + " legs");
		System.out.println("The cockroach name is " + name );
	}
}
