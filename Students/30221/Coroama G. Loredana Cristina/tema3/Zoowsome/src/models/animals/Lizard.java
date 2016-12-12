package models.animals;

public class Lizard extends Reptile {
	int NrOfLegs;
	 String name;
	 public boolean laysEggs;
	public Lizard(int Nr, String C, boolean eggs)
		{
			NrOfLegs=Nr;
			name=C;
			laysEggs=eggs;
		}
	public Lizard(){
		Lizard lizardobject= new Lizard();
	}
	 public void saying()
		{
		 System.out.println("Reptile/Lizard ");
			System.out.println("the name is "+name);
			System.out.println("nr of legs is  "+ NrOfLegs);
			System.out.println("LaysEggs: "+((laysEggs==true)?name+" lays eggs ":name+" doesn't lay eggs :( "));

		}

}
