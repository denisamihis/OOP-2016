package models.animals;

public abstract class insect extends animals{
	
	private boolean canFly;
	private boolean isDangerous;
	
	protected insect(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
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