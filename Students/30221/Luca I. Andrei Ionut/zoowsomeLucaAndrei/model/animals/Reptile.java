package animals;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Reptile(Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public Boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(Boolean doesItLay) {
		laysEggs = doesItLay;
	}
}