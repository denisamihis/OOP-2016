package animals;

import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;

	public Insect(Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public Boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(Boolean possibilityOfFlight) {
		canFly = possibilityOfFlight;
	}

	public Boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(Boolean possibilityOfDanger) {
		isDangerous = possibilityOfDanger;
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