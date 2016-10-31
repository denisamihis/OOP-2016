package models.animals;

public class Chicken extends Bird {
	boolean migrates;
	 int avgFlightAltitude;
	 int NrOfLegs;
	 String name;

		public Chicken(int Nr, String C, boolean migr, int avg)
		{
			NrOfLegs=Nr;
			name=C;
			avgFlightAltitude=avg;
			migrates=migr;
			
		}
		public Chicken(){
			Chicken chickenobject= new Chicken();
		}
	public void saying()
	{System.out.println("Bird/Eagle ");
		
		System.out.println("the name is "+name);
		System.out.println("nr of legs is  "+ NrOfLegs);
		System.out.println("AvgFlightAltitude "+avgFlightAltitude);
		System.out.println("Does it migrate?? "+((migrates==true)?name+" migrates ":name+" doesn't migrate :( "));

	}
	

}
