package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	
	
	public Whale(){
		super(5.2,0.7);
		setNrOfLegs(0);
		setName("Whale");
		setWaterType(waterType.SALTWATER);
		setSwimDepth(3000);
		
	}
	
	public Whale(int nrOfLegs, String name, waterType type, int avgSwimDepth,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.type=type;
		this.avgSwimDepth=avgSwimDepth;
	}
}
