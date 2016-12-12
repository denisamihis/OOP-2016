package models.animals;

public class Snake extends Reptile {
	
		int NrOfLegs;
		 String name;
		 public boolean laysEggs;
		 public Snake(int Nr, String C, boolean eggs)
			{
				NrOfLegs=Nr;
				name=C;
				laysEggs=eggs;
			}
		 public Snake(){
				Snake snakeobject= new Snake();
			}
		 public void saying()
			{
			 System.out.println("Reptile/Snake ");
				
				System.out.println("the name is "+name);
				System.out.println("nr of legs is  "+ NrOfLegs);
				System.out.println("LaysEggs: "+((laysEggs==true)?name+" lays eggs ":name+" doesn't lay eggs :( "));

			}


}
