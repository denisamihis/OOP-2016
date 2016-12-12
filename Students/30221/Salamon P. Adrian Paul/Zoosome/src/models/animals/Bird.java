package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	public Bird(Double maintaneanceCost, double percKill) {
		super(maintaneanceCost, percKill);

	}

	Boolean migrates;
	Integer avgFlightAltitude;

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));

	}

	public void decodeFromXml(Element element) {
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(
				Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));

	}

	public Boolean getMigrates() {
		return migrates;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
