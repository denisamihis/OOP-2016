package models.animals;

public abstract class mammal extends animals{
	private float normalBodyTemp;
	private float percBodyHair;
	
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