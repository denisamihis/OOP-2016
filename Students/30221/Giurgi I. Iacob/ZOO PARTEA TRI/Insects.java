package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository. createNode;
import javax.xml.stream.*;

import org.w3c.dom.Element;

public abstract class Insects extends Animal {
	public boolean canFly;
	public boolean isDangerous;
	
	public Insects(boolean canFly,boolean isDangerous,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}
	public void setCanFly(Boolean  canFly){
  		this.canFly = canFly;		  		
  	}		  	
 	public void setIsDangerous(boolean isDangerous){		 
  		this.isDangerous = isDangerous;		  		
  	}		  	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		 		super.encodeToXml(eventWriter);
		 		createNode(eventWriter, "canFly" , String.valueOf(getCanFly()));
		 	createNode(eventWriter, "isDangerous" , String.valueOf(getIsDangerous()));
		 	}
	
	public void decodeFromXml(Element element ) {
		setCanFly(Boolean. valueOf(element.getElementsByTagName( "canFly" ).item(0).getTextContent()));
		setIsDangerous(Boolean. valueOf(element.getElementsByTagName( "isDangerous" ).item(0).getTextContent()));
		}

}
