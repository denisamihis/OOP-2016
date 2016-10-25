package models.animlas;

public class Moschito extends Insect {
	private boolean bites;
	public Moschito (String name, boolean bites){
		super( name, 4, true ,false);
		this.bites=bites;
	}
	public Moschito (){
		super( "Unknown", 4, true ,false);
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
