package models.animals;

public class Dolphin extends Aquatic{

	private int nrOfLegs;
	private String name;
	public int avgSwimDepth;	
	/*public enum waterType{			
		saltwater, freshwater;
	}*/
	public Dolphin(int nr, String n, int asd){
		nrOfLegs=nr;
		name=n;
		avgSwimDepth=asd;
	}
	public  Dolphin(){
		 Dolphin  dolphinobject= new  Dolphin();
		}
	public void caracteristicipropri(){
		//System.out.println("The dolphin  lives in" + waterType  );
		System.out.println("The dolphin has " + avgSwimDepth + " average swim depth"  );
	}
	public void saying(){
		System.out.println("The dolphin has "  + nrOfLegs + " legs");
		System.out.println("The dolphin name is " + name );
	}
}
