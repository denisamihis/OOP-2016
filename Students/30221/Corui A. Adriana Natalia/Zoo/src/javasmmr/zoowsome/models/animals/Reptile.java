package javasmmr.zoowsome.models.animals;

public class Reptile extends Animal{

	public Reptile(double maintCosts,double precDanger) {
		super(maintCosts, precDanger);
		// TODO Auto-generated constructor stub
	}
	private boolean layEggs;
	public boolean getEgg()
	{
		return layEggs;
	}
	public void setEgg(boolean layEggs)
	{
		this.layEggs=layEggs;
	}
}
