package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal{
	private Double  normalBodyTemp;
	private Double  percBodyHair;
	protected Mammal(Double  maintenanceCost , Double  dangerPerc) {
		super(maintenanceCost , dangerPerc);
	}
	public Double  getNormalBodyTemp(){
		return normalBodyTemp;
	}
	public Double  getPercBodyHair(){
		return percBodyHair;
	}
	public void setNormalBodyTemp(Double  normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	public void setPercBodyHair(Double  percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp" , String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair" , String.valueOf(getPercBodyHair()));
	}
	public void decodeFromXml(Element element){
		setNormalBodyTemp(Double.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Double.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
