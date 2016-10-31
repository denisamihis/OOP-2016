package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{

	public Lizard(){
		setNrOfLegs(4);
		setName("Lizard");
		setLayEggs(Boolean.TRUE);
	}
	
	public Lizard(Integer nrOfLegs,String name,Boolean layEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
}
