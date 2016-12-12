package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic {
	public Salmon (int avgSwimDepth,Water waterType){
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Salmon (){
		nrOfLegs=0;
		name="Salmon";
	}

}
