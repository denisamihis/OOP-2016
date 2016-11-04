package javasmmr.zoowsome.models.animals;

public class Seal extends Aquatic{
	public Seal(){
		super(1.5,0.2);
		setNrOfLegs(0);
		setName("Seal");
		setWaterType(waterType.SALTWATER);
		setSwimDepth(500);
	}
	public Seal(int nrOfLegs, String name, waterType type, int avgSwimDepth,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.type=type;
		this.avgSwimDepth=avgSwimDepth;
	}
}
