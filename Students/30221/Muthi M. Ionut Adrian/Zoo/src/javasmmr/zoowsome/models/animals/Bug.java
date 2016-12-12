package javasmmr.zoowsome.models.animals;

public class Bug extends Insect {
	
	public Bug(String name, boolean fly,boolean dangerous){
		
		this.setName(name);
		this.setCanFly(fly);
		this.setIsDangerous(dangerous);
	}
	
	public Bug(){
		this.setName("Bug");
		this.setCanFly(false);
		this.setIsDangerous(false);
	}

}
