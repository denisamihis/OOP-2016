package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;
	
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public float getPercBodyHair(){
		return percBodyHair;
	}
	
	public void setNormalBodyTemp(float temp){
		normalBodyTemp=temp;
	}
	
	public void setPercBodyHair(float bodyHair){
		percBodyHair=bodyHair;
	}
	
	
}
