package models.animlas;

public class Butterfly extends Insect {
	private boolean beautiful;
	public Butterfly (String name,  boolean beautiful){
		super(name, 8, true ,false);
		this.beautiful=beautiful;
	}
	public Butterfly (){
		super( "Unknown", 8, true ,false);
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
