package models.animals;

public abstract class Mammal extends Animal{
	private double normalBodyTemp;
	private double percBodyHair;
	
	public double getNormalBodyTemp(){
		return normalBodyTemp;
	}
	public double getpercBodyHair(){
		return percBodyHair;
	}
	public void setNormalBodyTemp(double normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	public void setPercBodyHair(double percBodyHair){
		this.percBodyHair = percBodyHair;
	}
}
