package models.animals;

public class Penguin extends Aquatic{
	public Penguin(){
		setNrOfLegs(2);
		setName("Penguin");
		setAvgSwimDepth(35);
		setWaterType(WaterType.FRESHWATER);
	}
	public Penguin(int nrOfLegs , String name , int avgSwimDepth , WaterType waterType){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
