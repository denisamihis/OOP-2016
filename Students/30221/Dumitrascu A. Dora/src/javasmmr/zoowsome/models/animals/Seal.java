package javasmmr.zoowsome.models.animals;

public class Seal extends Aquatic{
	public Seal(){
		setNrOfLegs(0);
		setName("Seal");
		setWaterType(waterType.SALTWATER);
		setSwimDepth(500);
	}
	public Seal(int nrOfLegs, String name, waterType type, int avgSwimDepth){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.type=type;
		this.avgSwimDepth=avgSwimDepth;
	}
}
