package models.animals;

public class Butterfly extends Insect {
	 int NrOfLegs;
	 String name;
	 boolean canFly;
	 boolean isDangerous;
	public  Butterfly(int Nr, String C, boolean fly, boolean danger)
		{
			NrOfLegs=Nr;
			name=C;
			canFly=fly;
			isDangerous=danger;
			
		}
	 public Butterfly(){
			Butterfly butterflyobject= new Butterfly();
		}
	public  void saying(){
		System.out.println("Insect/Butterfly ");
	 
		System.out.println("the name is "+name);
		System.out.println("no of legs is  "+ NrOfLegs);
		System.out.println("Can fly? "+((canFly==true)?name+" can fly ":name+" can't fly "));
		System.out.println("is it dangerous? "+((isDangerous==true)?name+" is very dangerous ":name+" isn't dangerous"));
	}

}
