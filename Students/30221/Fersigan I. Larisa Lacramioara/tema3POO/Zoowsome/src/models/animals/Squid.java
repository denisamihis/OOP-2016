package models.animals;

public class Squid extends Aquatic{
	private int nrOfLegs;
	private String name;
	public int avgSwimDepth;	
	/*public enum waterType{			
		saltwater, freshwater;
	}*/
	public Squid(int nr, String n, int depth){
		nrOfLegs=nr;
		name=n;
		avgSwimDepth=depth;
		//waterType=wtype;
	}
	public Squid(){
		Squid squidobject= new Squid();
		}
	public void caracteristicipropri(){
		//System.out.println("The squid lives in" + waterType  );
		System.out.println("The  squid has " + avgSwimDepth + " average swim depth"  );
	}
	public void saying(){
		System.out.println("The  squid has "  + nrOfLegs + " legs");
		System.out.println("The  squid name is " + name );
	}


}
