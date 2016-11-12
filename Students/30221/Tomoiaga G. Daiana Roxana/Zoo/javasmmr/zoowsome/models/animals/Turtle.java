package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle (boolean laysEggs){
		this.laysEggs = laysEggs;
	}
	
	public Turtle (){
		nrOfLegs=4;
		name="Turtle";
	}
}
