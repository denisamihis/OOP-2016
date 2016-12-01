package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


abstract public class Insect extends Animal{
public Insect(double mn, double dp) {
		super(mn, dp);
		// TODO Auto-generated constructor stub
	}
public boolean canFly;
public boolean isDangerous;
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
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
super.encodeToXml(eventWriter);
createNode(eventWriter, "canFly", String.valueOf(isCanFly()));
createNode(eventWriter, "isDangerous", String.valueOf(isDangerous()));
}
public void decodeFromXml(Element element) {
setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
}
}
