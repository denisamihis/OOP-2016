package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
		
	}
	
	public Cockroach(){
		this.setName("Cockroach");
		this.setNrOfLegs(6);
	}

}
