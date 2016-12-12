package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	
	public Eagle(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Eagle(){
		this.setName("eagle");
		this.setNrOfLegs(2);
	}

}
