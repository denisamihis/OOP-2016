package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {
	
	public Bee(String name, boolean fly,boolean dangerous){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
	}
	
	public Bee(){
		this.setName("Bee");
		this.setCanFly(true);
		this.setIsDangerous(true);
	}

}
