package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	public Whale (int avgSwimDepth,Water waterType){
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Whale (){
		nrOfLegs=0;
		name="Whale";
	}

}
