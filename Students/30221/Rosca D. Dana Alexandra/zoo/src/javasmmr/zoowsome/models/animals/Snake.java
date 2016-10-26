package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(){
		 setNrLegs(0);
		 setName("Snake");
		 setLayEggs(Boolean.TRUE);
		 }
		 
	public Snake(Integer nrOfLegs,String name,Boolean layEggs){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setLayEggs(layEggs);
	}
}
