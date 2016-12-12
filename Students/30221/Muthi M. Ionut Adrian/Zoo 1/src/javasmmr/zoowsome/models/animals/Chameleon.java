package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	
	public Chameleon(String name, boolean egg){
		
		this.setName(name);
		this.setLayEggs(egg);
	}
	
	public Chameleon(){
		
		this.setName("Chameleon");
		this.setLayEggs(true);
	}
	

}
