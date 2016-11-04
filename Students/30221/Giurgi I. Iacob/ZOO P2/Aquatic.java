package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	protected int avgSwimDepth;
	enum Water{
		Saltwater, Freshwater;
	}
	protected Water watertype;
	public Aquatic(int avg,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.avgSwimDepth=avg;
	
	}
	public void setWater(Water watertype){
		this.watertype=watertype;
	}
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}

	
	public Water getWaterType(){
		return watertype;
	}
}
