package models.animals;

public abstract class insect extends animals{
	
	private boolean canFly;
	private boolean isDangerous;
	
	public void setCanFly(boolean fly){
		canFly = fly;
	}
	public void setIsDangerous(boolean dangerous){
		isDangerous = dangerous;
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}
}