package javasmmr.zoowsome.models.animals;
public  abstract class Mammal extends Animal{
  public float normalBodyTemp;
  public float percBodyHair;
  
  public void setNormalBodyTemp(float normalBodyTemp){
	   this.normalBodyTemp=normalBodyTemp;
  }
  
  public void setPercBodyHair(float percBodyHair){
	   this.percBodyHair=percBodyHair;
  }
  
  public float getNormalBodyTemp(){
	  return normalBodyTemp;
  }
  
  
  public float getPercBodyHair(){
	  return percBodyHair;
  }
  
}
