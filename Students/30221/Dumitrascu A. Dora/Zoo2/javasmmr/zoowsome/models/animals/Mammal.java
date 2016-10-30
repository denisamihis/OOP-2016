package javasmmr.zoowsome.models.animals;

abstract class Mammal extends Animal{
	protected float normalBodyTemp;
	protected float percBodyHair; //% of body covered in hair
	
	public Mammal(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp=normalBodyTemp;
	}
	
	public float getPercBodyHair(){
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percBodyHair){
		this.percBodyHair=percBodyHair;
	}

}
