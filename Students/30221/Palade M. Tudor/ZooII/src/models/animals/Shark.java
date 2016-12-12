package models.animals;

public class Shark extends Aquatic{
	public Shark(){
		super(0.2 ,1.0);
		setAvgSwimDepth(3000);
		setWaterType(water.SALTED);
		setNrOfLegs(0);
		setName("Shark");
	}
	public Shark(int avgSwimDepth ,water waterType, int nrOfLegs, String name){
		super(0.2 , 1.0);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}