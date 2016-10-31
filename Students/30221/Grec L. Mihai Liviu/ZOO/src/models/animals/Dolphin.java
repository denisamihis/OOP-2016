package models.animals;

public class Dolphin extends Aquatic{
	public Dolphin(){
		super(7.4 , 0.12);
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(20);
		setWaterType(WaterType.SALTWATER);
	}
	public Dolphin(Integer nrOfLegs , String name , Integer avgSwimDepth , WaterType waterType){
		super(7.4 , 0.12);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
