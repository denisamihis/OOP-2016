package animals;

public abstract class Aquatic extends Animal {

	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Integer avgSwimDepth;

	public enum wType {
		Freshwater, Saltwater
	}

	private wType waterType;

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public wType getWaterType() {
		return waterType;
	}

	public void setWaterType(wType waterType) {
		this.waterType = waterType;
	}

}
