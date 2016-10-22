package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	
	public Butterfly(String name, boolean fly,boolean dangerous){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
	}
	
	public Butterfly(){
		this.setName("Butterfly");
		this.setCanFly(true);
		this.setIsDangerous(false);
	}

}
