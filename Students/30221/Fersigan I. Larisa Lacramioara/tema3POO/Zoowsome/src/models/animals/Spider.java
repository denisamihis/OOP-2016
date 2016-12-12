package models.animals;

public class Spider extends Insect{

	private int nrOfLegs;
	private String name;
	public boolean canFly;		
	public boolean isDangerous;
	
	public Spider(int nr, String n, boolean fly, boolean danger){
		nrOfLegs=nr;
		name=n;
		canFly=fly;
		isDangerous=danger;
	}
	public  Spider(){
		 Spider  spiderobject= new  Spider();
	}
	public void caracteristicipropri(){
		System.out.println("The spider  " + ((canFly==true) ? "can fly":"can't fly"));
		System.out.println("The spider " + ((isDangerous==true) ?  "is dangeroua ":"isn't dangerous" ));
	}
	public void saying(){
		System.out.println("The spider has "  + nrOfLegs + " legs");
		System.out.println("The spider name is " + name );
	}
}
