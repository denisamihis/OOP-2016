package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal{
	public Mammal(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private Float normalBodyTemp;
	private Float percBodyHair;
	
	public Float getNormalBodyTemp(){
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(Float normalBodyTemp){
		this.normalBodyTemp=normalBodyTemp;
	}
	
	public Float getPercBodyHair(){
		return percBodyHair;
	}
	
	public void setPercBodyHair(Float percBodyHair){
		this.percBodyHair=percBodyHair;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"normalBodyTemp",String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter,"percBodyHair",String.valueOf(getPercBodyHair()));
	}

	public void decodeFromXml(Element element) {
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
 	}
}
