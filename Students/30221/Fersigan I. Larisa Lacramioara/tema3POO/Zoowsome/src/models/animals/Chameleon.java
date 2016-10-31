package models.animals;

public class Chameleon extends Reptile{

	private int nrOfLegs;
	private String name;
	public boolean laysEggs;
	public Chameleon(int nr, String n, boolean egg){
		nrOfLegs=nr;
		name=n;
		laysEggs=egg;
	}
	public Chameleon(){
		Chameleon chameleonobject= new Chameleon();}
	public void caracteristicipropri(){
		System.out.println("The chameleon  " + ((laysEggs==true) ? "does it lay eggs":"doesn't it lay eggs"));

	}
	public void saying(){
		System.out.println("The chameleon has "  + nrOfLegs + " legs");
		System.out.println("The chameleon name is " + name );
	}

}
