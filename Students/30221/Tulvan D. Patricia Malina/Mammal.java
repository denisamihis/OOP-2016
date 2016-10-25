package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{
	private Float normalBodyTemp;
	private Float percBodyHair;
	
	public Float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(Float normalBodyTemp){
		this.normalBodyTemp=normalBodyTemp;
	}
	
	public Float getPercBodyHair(){
		return percBodyHair;
	}
	
	public void setPercBodyHair(Float percBodyHair){
		this.percBodyHair=percBodyHair;
	}
	
	

}
