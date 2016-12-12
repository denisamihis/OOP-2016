package models.animals;

abstract class Mammal extends Animal{
	float normalBodyTemp;
	double percBodyHair;
	
	protected Mammal(Double maintenanceCost , Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	public void setPercBodyHair(double percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	public double getPercBodyHair(){
		return percBodyHair;
	}
	
}