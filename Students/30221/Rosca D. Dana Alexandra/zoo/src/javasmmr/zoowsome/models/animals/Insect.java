package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal{
	private Boolean canFly;
	private Boolean isDangerous;
	 
	 public Boolean getCanFly(){
		 return canFly;
	 }
	
	 public void setCanFly(Boolean canFly){
		 this.canFly=canFly;
	 }
	
	 public Boolean getIsDangerous(){
		return isDangerous;
	 }
	 
	public void setIsDangerous(Boolean isDangerous){
	 	this.isDangerous=isDangerous;
	 }

}
