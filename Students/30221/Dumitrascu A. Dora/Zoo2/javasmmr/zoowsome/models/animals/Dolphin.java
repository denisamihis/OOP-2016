package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	public Dolphin(){
		super(3,0.1);
		setNrOfLegs(0);
		setName("Dolphin");
		setWaterType(waterType.SALTWATER);
		setSwimDepth(300);
	}
	public Dolphin(int nrOfLegs, String name, waterType type, int avgSwimDepth,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.type=type;
		this.avgSwimDepth=avgSwimDepth;
	}
}

