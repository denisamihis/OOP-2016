package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract class Mammal extends Animal{
	protected float normalBodyTemp;
	protected float percBodyHair; //% of body covered in hair
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}
	public void decodeFromXml(Element element) {
		setCare(Boolean.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setCare(Boolean.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
		}
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
