package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public  abstract class Mammal extends Animal{
  public float normalBodyTemp;
  public float percBodyHair;
  
  public Mammal(float normalBodyTemp,float percBodyHair,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   super(nrOfLegs,name,maintenanceCost,dangerPerc);
	   this.normalBodyTemp=normalBodyTemp;
	   this.percBodyHair=percBodyHair;
  }
  
  public void setNormalBodyTemp(float temp){
	  this.normalBodyTemp=temp;
  }
  
  public void setPercBodyHair(float hair){
	  this.percBodyHair=hair;
  }
  public float getNormalBodyTemp(){
	  return normalBodyTemp;
  }
  
  
  public float getPercBodyHair(){
	  return percBodyHair;
  }
  
  public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	  		super.encodeToXml(eventWriter);
	 		createNode(eventWriter, "normalBodyTemp" , String.valueOf(getNormalBodyTemp()));
	  		createNode(eventWriter, "percBodyHair" , String.valueOf(getPercBodyHair()));
	  	}
  
  public void decodeFromXml(Element element){
	  	setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
	  	setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	  	}
  
}
