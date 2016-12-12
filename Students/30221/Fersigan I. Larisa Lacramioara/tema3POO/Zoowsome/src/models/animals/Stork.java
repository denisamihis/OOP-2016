package models.animals;

public class Stork extends Bird{

	private int nrOfLegs;
	private String name;
	public boolean migrates;		
	public int avgFlightAltitude;	
	
	public Stork(int nr, String n, boolean migr, int altitude){
		nrOfLegs=nr;
		name=n;
		migrates=migr;
		avgFlightAltitude=altitude;
	}
	public Stork(){
		Stork storkobject= new Stork();
	}
	public void caracteristicipropri(){
		System.out.println("The stork  " + ((migrates==true) ? "does migrate":"doesn't migrate"));
		System.out.println("The stork has " + avgFlightAltitude + " average flight altitude"  );
	}
	public void saying(){
		System.out.println("The stork has "  + nrOfLegs + " legs");
		System.out.println("The stork name is " + name );
	}
}
