package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(){
		setNrOfLegs(0);
		setName("Snake");
		setLayEggs(Boolean.FALSE);
	}
	
	public Snake(Integer nrOfLegs,String name,Boolean layEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
}
