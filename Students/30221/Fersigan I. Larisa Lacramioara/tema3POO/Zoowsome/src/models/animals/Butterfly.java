package models.animals;

public class Butterfly extends Insect {
	private int nrOfLegs;
	private String name;
	public boolean canFly;		
	public boolean isDangerous;
	
	public Butterfly(int nr, String n, boolean fly, boolean danger){
		nrOfLegs=nr;
		name=n;
		canFly=fly;
		isDangerous=danger;
	}
	public Butterfly(){
		Butterfly butterflyobject= new Butterfly();
	}
	public void caracteristicipropri(){
		System.out.println("The butterfly  " + ((canFly==true) ? "can fly":"can't fly"));
		System.out.println("The butterfly " + ((isDangerous==true) ?  "is dangerous ":"isn't dangerous" ));
	}
	public void saying(){
		System.out.println("The butterfly has "  + nrOfLegs + " legs");
		System.out.println("The butterfly name is " + name );
	}

}
