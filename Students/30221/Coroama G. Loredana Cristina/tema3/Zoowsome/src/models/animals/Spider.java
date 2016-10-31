package models.animals;

public class Spider extends Insect {
	  int NrOfLegs;
	 String name;
	 boolean canFly;
	 boolean isDangerous;
	public  Spider(int Nr, String C, boolean fly, boolean danger)
		{
			NrOfLegs=Nr;
			name=C;
			canFly=fly;
			isDangerous=danger;
			
		}
	 public Spider(){
			Spider spiderobject= new Spider();
		}
	public  void saying(){
		System.out.println("Insect/Spider ");
		 
	 
		System.out.println("the name is "+name);
		System.out.println("no of legs is  "+ NrOfLegs);
		System.out.println("Can fly? "+((canFly==true)?name+" can fly ":name+" can't fly :( "));
		System.out.println("is it dangerous? "+((isDangerous==true)?name+" is very dangerous ":name+" isn t dangerous!!!!"));
	}

}
