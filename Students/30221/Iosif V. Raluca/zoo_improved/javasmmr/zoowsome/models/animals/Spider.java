package javasmmr.zoowsome.models.animals;

public class Spider  extends Insect {
	public Spider(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Spider(){
		this.setName("Spider");
		this.setNrOfLegs(8);
	}
	
}
