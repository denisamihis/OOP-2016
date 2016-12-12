package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	public Dolphin(){
		setNrOfLegs(0);
		setName("Dolphin");
		setWaterType(waterType.SALTWATER);
		setSwimDepth(300);
	}
	public Dolphin(int nrOfLegs, String name, waterType type, int avgSwimDepth){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.type=type;
		this.avgSwimDepth=avgSwimDepth;
	}
}

