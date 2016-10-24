package animals;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;

	public enum watType {
		Freshwater, Saltwater
	}

	private watType waterType;

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer swimDepth) {
		avgSwimDepth = swimDepth;
	}

	public watType getWaterType() {
		return waterType;
	}

	public void setWaterType(watType typeOfWater) {
		waterType = typeOfWater;
	}
}
