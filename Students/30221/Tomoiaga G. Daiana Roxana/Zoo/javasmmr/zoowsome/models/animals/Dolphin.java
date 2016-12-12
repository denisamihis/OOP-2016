package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	public Dolphin (int avgSwimDepth,Water waterType){
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Dolphin (){
		nrOfLegs=0;
		name="Dolphin";
	}

}
