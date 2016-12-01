package models.animals;

public abstract class mammal extends animals{
	private float normalBodyTemp;
	private float percBodyHair;
	
	protected mammal(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setNormalBodyTemp(float temp){
		normalBodyTemp = temp;
	}
	public void setPercBodyHair(float number){
		percBodyHair = number;
	}
	
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	public float getPercBodyHair(){
		return percBodyHair;
	}
}