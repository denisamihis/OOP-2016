package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Mammal extends Animal {
	
	
	public Mammal(double mn, double dp) {
		super(mn,dp);

		// TODO Auto-generated constructor stub
	}
	public float normalBodyTemp;
	public float percBodyHair;
	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}
	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	public float getPercBodyHair() {
		return percBodyHair;
	}
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "NormalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "PercBodyHair", String.valueOf(getPercBodyHair()));
		}
		public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("NormalBodyTemp").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("PercBodyHair").item(0).getTextContent()));
		}

}
