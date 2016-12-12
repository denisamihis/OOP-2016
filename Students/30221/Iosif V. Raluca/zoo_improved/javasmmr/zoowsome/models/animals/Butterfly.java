package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	
	public Butterfly(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Butterfly(){
		this.setName("Butterfly");
		this.setNrOfLegs(6);
	}

}
