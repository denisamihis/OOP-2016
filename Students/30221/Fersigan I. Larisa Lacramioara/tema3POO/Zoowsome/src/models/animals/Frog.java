package models.animals;

public class Frog extends Reptile{
	private int nrOfLegs;
	private String name;
	public boolean laysEggs;
	public Frog(int nr, String n, boolean egg){
		nrOfLegs=nr;
		name=n;
		laysEggs=egg;
	}
	public Frog(){
		Frog frogobject= new Frog();
		}
	public void caracteristicipropri(){
		System.out.println("The frog  " + ((laysEggs==true) ? "does it lay eggs":"doesn't it lay eggs"));

	}
	public void saying(){
		System.out.println("The frog has "  + nrOfLegs + " legs");
		System.out.println("The frog name is " + name );
	}

}
