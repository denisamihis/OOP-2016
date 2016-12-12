package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Hen extends Bird {
	public Hen() {
		super(5.0, 0.5);
		setName("MiniT-rex");
		setNrOfLegs(2);
		setAvgFlightAltitude(1);
		setMigrates(false);

	}

	public Hen(String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Hen);
	}
}
