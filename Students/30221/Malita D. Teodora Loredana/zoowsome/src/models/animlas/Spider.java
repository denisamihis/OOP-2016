package models.animlas;

public class Spider extends Insect {
	private boolean beautiful;
	public Spider (String name, int age, boolean beautiful){
		super(" Araneae", name, age, false ,true);
		this.beautiful=beautiful;
	}
	public Spider (){
		super(" Araneae", "Unknown", 0, false ,true);
		this.beautiful=false;
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
