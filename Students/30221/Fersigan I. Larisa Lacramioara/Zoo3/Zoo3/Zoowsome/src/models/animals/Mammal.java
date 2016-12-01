package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static repositories.AnimalRepository.createNode; 

public abstract class Mammal extends Animal  {
	public Mammal(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	private float normalBodyTemp;	//Normal body temperature
	private float percBodyHair;		//% of body covered in hair
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
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));  
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));  
		}
	public void decodeFromXml(Element element) { 
		setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent())); 
	setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
	}  
	
}
