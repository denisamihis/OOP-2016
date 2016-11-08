package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Reptile(Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public Boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(Boolean doesItLay) {
		laysEggs = doesItLay;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}