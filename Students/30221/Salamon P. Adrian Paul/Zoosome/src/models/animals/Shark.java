package models.animals;

public class Shark extends Aquatic {
	public Shark (){
		setNrOfLegs(0);
	}

	public Shark(String name,Integer avgSwimDepth,WaterType waterType){
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setNrOfLegs(0);
	}

}