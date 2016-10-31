package models.animals;

abstract public class Animal {
	private  int NrOfLegs;
	private String name;
	public void  setNrOfLegs (int NrLegs)
	{
		NrOfLegs=NrLegs;
	}
	public void setName(String nume)
	{
		name=nume;
	}
	
	public int getNrOfLegs(){
		return NrOfLegs;
	}
	public  String getName(){
		return name;
	}
public static void main (String[] args)
{
	Tiger obiect=new Tiger(4,"pisica",0,0);
	obiect.saying();
	Cow obiect2=new Cow(4,"Paulaaaa",0,0);
	obiect2.saying();
	Monkey obiect3=new Monkey(4,"Cosmin",0,0);
	obiect3.saying();
	Spider obiect4=new Spider(12,"Tarantula",false,true);
	obiect4.saying();
	Butterfly obiect5=new Butterfly(6,"Yay Pink Butterfly ", true, false);
	obiect5.saying();
	Cockroach obiect6=new Cockroach(4,"BlackCockroach",false,false);
			obiect6.saying();
	//ReggaeShark obiect7=new ReggaeShark(0," ReggaeShark ",20,0);
		Eagle obiect7=new Eagle(4,"TheBigEagle",false,40);
			obiect7.saying();
			Chicken obiect8=new Chicken(4," sjkdfksjdbfs ",false,20);
			obiect8.saying();
			Owl obiect9=new Owl(4," Ruby ",false,330);
			obiect9.saying();
			Lizard obiect10=new Lizard(4," Martin ",true);
			obiect10.saying();
			Snake obiect11=new Snake(4," Elyan ",true);
			obiect11.saying();
			Turtle obiect12=new Turtle(4," Kludd ",true);
			obiect12.saying();
}
}
