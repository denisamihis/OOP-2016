package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public Butterfly(){
		 setNrLegs(6);
		 setName("Butterfly");
		 setCanFly(Boolean.TRUE);
		 setIsDangerous(Boolean.FALSE);
		 }
		
	public Butterfly(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setCanFly(canFly);
		 setIsDangerous(isDangerous);
		 }

}
