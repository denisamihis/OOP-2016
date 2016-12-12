package models.animals;

public class Jellyfish extends Aquatic{
	public Jellyfish(){
		super(0.1 ,0.0);
		setAvgSwimDepth(2000);
		setWaterType(water.SALTED);
		setNrOfLegs(0);
		setName("Jellyfish");
	}
	public Jellyfish(int avgSwimDepth ,water waterType, int nrOfLegs, String name){
		super(0.1 , 0.0);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}