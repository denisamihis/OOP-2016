package models.animals;

public class Turtle extends Reptile {
	int NrOfLegs;
	 String name;
	 public boolean laysEggs;
	public  Turtle(int Nr, String C, boolean eggs)
		{
			NrOfLegs=Nr;
			name=C;
			laysEggs=eggs;
		}
	public Turtle(){
		Turtle turtleobject= new Turtle();
	}
	 public void saying()
		{
		 System.out.println("Reptile/Turtle ");
			System.out.println("the name is "+name);
			System.out.println("nr of legs is  "+ NrOfLegs);
			System.out.println("LaysEggs: "+((laysEggs==true)?name+" lays eggs ":name+" doesn't lay eggs :( "));

		}
}
