package models.animals;

import models.animals.ReggaeShark.waterType;

public class Dolphin extends Aquatic {
	int NrOfLegs;
	 String name;
	  int avgSwimDepth;
	 // enum waterType{
	 //	Saltwater, Freshwater;
	 	//}
	  public enum waterType {
		  Saltwater, Freshwater;;

		    public waterType oppose() {
		        switch(this) {
		            case Saltwater: return Saltwater;
		            case Freshwater: return Freshwater;
		       
		        }
		        return null;
		    }
		}
	 public  Dolphin(int Nr, String C, int avg)
		{
			NrOfLegs=Nr;
			name=C;
			avgSwimDepth=avg;
		
			
			
		}
	 public Dolphin(){
			Dolphin dolphinobject= new Dolphin();
		}
	public  void saying(){
	 System.out.println("no of legs is  "+ NrOfLegs);
		System.out.println("the name is "+name);
		System.out.println("average swim depth "+avgSwimDepth);
		//System.out.println("the watertype -> "+waterType);
	}
}
