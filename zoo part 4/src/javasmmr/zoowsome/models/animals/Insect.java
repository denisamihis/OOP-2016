package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public boolean getCanFly(){
		return canFly;
	}
	
	public void setCanFly(boolean fly){
		canFly=fly;
	}
	
	public boolean getIsDangerous(){
		return isDangerous;
	}
	
	public void setIsDangerous(boolean dangerous){
		isDangerous=dangerous;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
		}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		}

}
