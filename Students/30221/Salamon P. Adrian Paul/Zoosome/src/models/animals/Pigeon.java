package models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;
import static repositories.AnimalRepository.createNode;

public class Pigeon extends Bird {
	public Pigeon() {
		super(5.0, 0.2);
		setName("Winged Rat");
		setNrOfLegs(2);
		setAvgFlightAltitude(20);
		setMigrates(true);
	}

	public Pigeon(String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Pigeon);
	}

}
