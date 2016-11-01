package models.animals;

public abstract class Reptile extends Animal{
	public Reptile(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}

	public boolean laysEggs;		//Does it lay eggs or not 

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

}
