package javasmmr.zoowsome.models.animals;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import org.w3c.dom.Element;

public abstract class Animal implements Killer, XML_Parsable{
   private int nrOfLegs;
   protected String name;
   protected double maintenanceCost;
   protected double dangerPerc;
   protected boolean takenCareof;
   
   
   public Animal(int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
	   
	   this.nrOfLegs=nrOfLegs;
	   this.name = name;
	   this.maintenanceCost=maintenanceCost;
	   this.dangerPerc=dangerPerc;
	   takenCareof=false;
   }
   
   public boolean kill(){
	   Random kill= new Random();
	   double number=kill.nextDouble();
	   if(number < dangerPerc)
		   return true;
	   else return false;
   }
   
   public double getPredisposition(){
	   return 0.0;
   }
   
   public void setTakenCareOf(boolean Take){
	   this.takenCareof=Take;
   }
   
   public boolean getTakenCareOf(){
	   return takenCareof;
   }
   public int getNrOfLegs () {
		return nrOfLegs;
   }
		
   public String getName () {
			return name;	
   }
   
   public double getMaintenanceCost()
   	{
   		return maintenanceCost;
   	}
   public double getDangerPerc()
   { return dangerPerc;   }
   
   
   public void setName(String name){
 		this.name = name;
   }
    public void setNrOfLegs(int leg){
    	this.nrOfLegs=leg;
    }
    public void setMaintenanceCost(double a){
    	this.maintenanceCost=a;
    }
   
    public void setDangerPerc(double a){
    	this.dangerPerc=a;
    }
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	   createNode(eventWriter, "nrOfLegs", String. valueOf(this.nrOfLegs));
	   createNode(eventWriter, "name", String. valueOf(this. name));
	   createNode(eventWriter, "maintenanceCost", String. valueOf(this. maintenanceCost));
	   createNode(eventWriter, "dangerPerc", String. valueOf(this. dangerPerc));
	   createNode(eventWriter, "takenCareOf", String. valueOf(this. takenCareof));
	   }
   
  public void decodeFromXml(Element element ) {
	   setNrOfLegs(Integer. valueOf(element.getElementsByTagName( "nrOfLegs" ).item(0).getTextContent()));
	   setName( element.getElementsByTagName( "name" ).item(0).getTextContent());
	   setMaintenanceCost(Double. valueOf(element .getElementsByTagName( "maintenanceCost" ).item(0).getTextContent()));
	   setDangerPerc(Double. valueOf(element.getElementsByTagName( "dangerPerc" ).item(0).getTextContent()));
	   setTakenCareOf(Boolean. valueOf(element.getElementsByTagName( "takenCareOf" ).item(0).getTextContent()));
	   }
}


