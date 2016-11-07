package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;

import javax.xml.stream.*;

import org.w3c.dom.Element;
public abstract class Bird extends Animal {
   public boolean migrates;
   public int avgFlightAltitude;
   
   public Bird(boolean migrates,int average,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   super(nrOfLegs,name,maintenanceCost,dangerPerc);
	   this.migrates=migrates;
	   this.avgFlightAltitude=average;
	   
   }
   public void setMigrates(Boolean migrates){
 		this.migrates = migrates;		  		
 	}		  	
 	public void setAvgFlightAltitude(Integer avgFlightAltitude){		 
 		this.avgFlightAltitude=avgFlightAltitude;
 	}
   
   public boolean getMigrates(){
	   return migrates;
   }
   
   public int getAvgFlightAltitude(){
	   return avgFlightAltitude;
   }
   
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	   		super.encodeToXml(eventWriter);
	   		createNode(eventWriter, "migrates" , String.valueOf(getMigrates()));
	   		createNode(eventWriter, "avgFlightAltitude" , String.valueOf(getAvgFlightAltitude()));
	   	}
   public void decodeFromXml(Element element){
	   		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
	   		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	   	}
   
}
