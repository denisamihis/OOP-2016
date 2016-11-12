package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
	public Insect(Double maintaneanceCost, double percKill) {
		super(maintaneanceCost, percKill);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));

	}

	public void decodeFromXml(Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));

	}

	Boolean canFly;
	Boolean isDangerous;

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;

	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public Boolean getCanFly() {
		return canFly;
	}

	public Boolean getIsDangerous() {
		return isDangerous;
	}

}
