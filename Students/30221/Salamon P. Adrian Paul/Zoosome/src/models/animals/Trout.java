package models.animals;

public class Trout extends Aquatic {
	public Trout(){
		setNrOfLegs(0);
	}

	public Trout(String name,Integer avgSwimDepth,WaterType waterType){
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setNrOfLegs(0);
	}
	

}