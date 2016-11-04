package javasmmr.zoowsome.models.animals;
public  abstract class Mammal extends Animal{
  public float normalBodyTemp;
  public float percBodyHair;
  
  public Mammal(float normalBodyTemp,float percBodyHair,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   super(nrOfLegs,name,maintenanceCost,dangerPerc);
	   this.normalBodyTemp=normalBodyTemp;
	   this.percBodyHair=percBodyHair;
  }
  
  
  public float getNormalBodyTemp(){
	  return normalBodyTemp;
  }
  
  
  public float getPercBodyHair(){
	  return percBodyHair;
  }
  
}
