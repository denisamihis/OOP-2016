package models.animals;

public class Pinguin extends Bird {
	private int nrOfLegs;
	private String name;
	public boolean migrates;		
	public int avgFlightAltitude;	
	
	public Pinguin(int nr, String n, boolean migr, int altitude){
		nrOfLegs=nr;
		name=n;
		migrates=migr;
		avgFlightAltitude=altitude;
	}
	public Pinguin(){
		Pinguin pinguinobject= new Pinguin();
	}
	public void caracteristicipropri(){
		System.out.println("The pinguin  " + ((migrates==true) ? "does migrate":"doesn't migrate"));
		System.out.println("The pinguin has " + avgFlightAltitude + " average flight altitude"  );
	}
	public void saying(){
		System.out.println("The pinguin has "  + nrOfLegs + " legs");
		System.out.println("The pinguin name is " + name );
	}


}
