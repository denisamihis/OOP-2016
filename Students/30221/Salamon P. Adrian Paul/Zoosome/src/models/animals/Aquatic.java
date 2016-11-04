package models.animals;

public abstract class Aquatic extends Animal {

	private Integer avgSwimDepth;
	private WaterType waterType;

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}
}
