package models.animlas;

public class Butterfly extends Insect {
	private boolean beautiful;
	public Butterfly (String name, int age, boolean beautiful){
		super(" Rhopalocera", name, age, true ,false);
		this.beautiful=beautiful;
	}
	public Butterfly (){
		super("Rhopalocera", "Unknown", 0, false ,true);
		this.beautiful=true;
	}
	public boolean getBeautiful()
	{
		return beautiful;
	}
	public void setBeautiful(boolean beautiful)
	{
		this.beautiful=beautiful;
	}


}
