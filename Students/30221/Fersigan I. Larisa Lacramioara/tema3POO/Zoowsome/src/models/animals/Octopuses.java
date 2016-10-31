package models.animals;

public class Octopuses extends Aquatic {
	private int nrOfLegs;
	private String name;
	public int avgSwimDepth;	
	/*public enum waterType{			
		saltwater, freshwater;
	}*/
	public Octopuses(int nr, String n, int depth){
		nrOfLegs=nr;
		name=n;
		avgSwimDepth=depth;
		//waterType=wtype;
	}
	public Octopuses(){
		Octopuses octopusesobject= new Octopuses();
		}
	public void caracteristicipropri(){
		//System.out.println("The Octopuse  lives in" + waterType  );
		System.out.println("The Octopuse has " + avgSwimDepth + " average swim depth"  );
	}
	public void saying(){
		System.out.println("The Octopuse has "  + nrOfLegs + " legs");
		System.out.println("The Octopuse name is " + name );
	}

}
