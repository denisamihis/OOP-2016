package models.animals;

public class Owl extends Bird{
	boolean migrates;
	 int avgFlightAltitude;
	 int NrOfLegs;
	 String name;

		public Owl(int Nr, String C, boolean migr, int avg)
		{
			NrOfLegs=Nr;
			name=C;
			avgFlightAltitude=avg;
			migrates=migr;
			
		}
		public Owl(){
			Owl owlobject= new Owl();
		}
	public void saying()
	{System.out.println("Bird/Owl ");
		
		System.out.println("the name is "+name);
		System.out.println("nr of legs is  "+ NrOfLegs);
		System.out.println("AvgFlightAltitude "+avgFlightAltitude);
		System.out.println("Does it migrate?? "+((migrates==true)?name+" migrates ":name+" doesn't migrate :( "));

	}
}
