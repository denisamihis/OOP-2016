package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	
	public Shark (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
		
	}
	
	public Shark(){
		this.setName("Shark");
		this.setNrOfLegs(0);
	}

}
