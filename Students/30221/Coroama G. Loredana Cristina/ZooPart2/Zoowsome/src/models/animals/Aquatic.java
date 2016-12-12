package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
import models.animals.WaterType;
abstract public class Aquatic extends Animal {
public Aquatic(double mn, double dp) {
		super(mn, dp);
		// TODO Auto-generated constructor stub
	}
public int avgSwimDepth;
public  WaterType type;
public int getAvgSwimDepth() {
	return avgSwimDepth;
}
public void setAvgSwimDepth(int avgSwimDepth) {
	this.avgSwimDepth = avgSwimDepth;
}

public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	super.encodeToXml(eventWriter);
	createNode(eventWriter, "AvgSwimDepth", String.valueOf(getAvgSwimDepth()));
	createNode(eventWriter, "WaterType", String.valueOf(type.toString()));
	}
	public void decodeFromXml(Element element) {
	setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("AvgSwimDepth").item(0).getTextContent()));
	setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("WaterType").item(0).getTextContent()));
	}
}
