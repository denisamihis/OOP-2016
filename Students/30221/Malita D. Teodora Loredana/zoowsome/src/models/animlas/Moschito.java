package models.animlas;

public class Moschito extends Insect {
	private boolean bites;
	public Moschito (String name, int age, boolean bites){
		super("Culicidae", name, age, true ,false);
		this.bites=bites;
	}
	public Moschito (){
		super(" Culicidea", "Unknown", 0, false ,true);
		this.bites=false;
	}
	public boolean getBites()
	{
		return bites;
	}
	public void setBites(boolean bites)
	{
		this.bites=bites;
	}
}
