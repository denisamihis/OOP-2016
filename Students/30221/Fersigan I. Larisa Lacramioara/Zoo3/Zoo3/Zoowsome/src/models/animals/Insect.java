package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static repositories.AnimalRepository.createNode;


public abstract class Insect extends Animal{
	public Insect(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	public boolean canFly;		//Can it fly?
	public boolean isDangerous;		//Is it dangerous? 
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(isCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(isDangerous()));
		}
	public void decodeFromXml(Element element) { 
		setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent())); 
	setTakeCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}  

}
