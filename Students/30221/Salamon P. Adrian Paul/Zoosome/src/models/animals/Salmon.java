package models.animals;

public class Salmon extends Aquatic {
	public Salmon(){
		setNrOfLegs(0);
	}

	public Salmon(String name,Integer avgSwimDepth,WaterType waterType){
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setNrOfLegs(0);
	}

}
