package javasmmr.zoowsome.models.animals;

public class Cameleon extends Reptile{
	public Cameleon(){
		 setNrLegs(4);
		 setName("Cameleon");
		 setLayEggs(Boolean.TRUE);
		 }
		 
	public Cameleon(Integer nrOfLegs,String name,Boolean layEggs){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setLayEggs(layEggs);
	}

}
