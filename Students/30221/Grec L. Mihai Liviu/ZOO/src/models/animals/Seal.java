package models.animals;

public class Seal extends Aquatic{
	public Seal(){
		setNrOfLegs(0);
		setName("Seal");
		setAvgSwimDepth(40);
		setWaterType(WaterType.FRESHWATER);
	}
	public Seal(int nrOfLegs , String name , int avgSwimDepth , WaterType waterType){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
