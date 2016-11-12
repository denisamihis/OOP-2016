package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach (boolean canFly, boolean isDangerous){
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Cockroach (){
		nrOfLegs=6;
		name="Cockroach";	
	}
}
