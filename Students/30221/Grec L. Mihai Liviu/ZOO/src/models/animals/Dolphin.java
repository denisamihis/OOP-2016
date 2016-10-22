package models.animals;

public class Dolphin extends Aquatic{
	public Dolphin(){
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(20);
		setWaterType(WaterType.SALTWATER);
	}
	public Dolphin(int nrOfLegs , String name , int avgSwimDepth , WaterType waterType){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
