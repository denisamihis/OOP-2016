package javasmmr.zoowsome.models.animals;

public class Scorpion extends Reptile{
	public Scorpion(){
		 setNrLegs(8);
		 setName("Scorpion");
		 setLayEggs(Boolean.TRUE);
		 }
		 
	public Scorpion(Integer nrOfLegs,String name,Boolean layEggs){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setLayEggs(layEggs);
	}

}
