package models.animals;

public class Tuna extends Aquatic{
	public Tuna(){
		super(0.2 ,0.0);
		setAvgSwimDepth(224);
		setWaterType(water.SALTED);
		setNrOfLegs(0);
		setName("Tuna");
	}
	public Tuna(int avgSwimDepth ,water waterType, int nrOfLegs, String name){
		super(0.2 ,0.0);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}