package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public Boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(Boolean migrate) {
		migrates = migrate;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer flightAltitude) {
		avgFlightAltitude = flightAltitude;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));

	}
}
