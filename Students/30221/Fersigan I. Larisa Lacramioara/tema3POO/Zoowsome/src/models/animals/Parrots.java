package models.animals;

public class Parrots extends Bird {
	private int nrOfLegs;
	private String name;
	public boolean migrates;		
	public int avgFlightAltitude;	
	
	public Parrots(int nr, String n, boolean migr, int altitude){
		nrOfLegs=nr;
		name=n;
		migrates=migr;
		avgFlightAltitude=altitude;
	}
	public Parrots(){
		Parrots parrotsobject= new Parrots();
	}
	public void caracteristicipropri(){
		System.out.println("The parrot  " + ((migrates==true) ? "does migrate":"doesn't migrate"));
		System.out.println("The parrot has " + avgFlightAltitude + " average flight altitude"  );
	}
	public void saying(){
		System.out.println("The parrot has "  + nrOfLegs + " legs");
		System.out.println("The parrot name is " + name );
	}

}
