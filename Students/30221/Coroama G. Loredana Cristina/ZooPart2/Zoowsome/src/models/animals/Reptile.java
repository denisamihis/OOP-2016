package models.animals;

abstract public class Reptile extends Animal{
	public Reptile(double mn, double dp) {
		super(mn, dp);
		// TODO Auto-generated constructor stub
	}

	public boolean laysEggs;

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

}
