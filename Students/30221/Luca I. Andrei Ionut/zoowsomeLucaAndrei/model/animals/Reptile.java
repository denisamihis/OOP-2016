package animals;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(Boolean doesItLay) {
		laysEggs = doesItLay;
	}
}