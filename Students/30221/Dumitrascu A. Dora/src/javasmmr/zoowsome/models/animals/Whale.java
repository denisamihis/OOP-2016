package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	public Whale(){
		setNrOfLegs(0);
		setName("Whale");
		setWaterType(waterType.SALTWATER);
		setSwimDepth(3000);
	}
	public Whale(int nrOfLegs, String name, waterType type, int avgSwimDepth){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.type=type;
		this.avgSwimDepth=avgSwimDepth;
	}
}
