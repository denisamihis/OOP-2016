package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Turkey extends Bird {
	public Turkey() {
		super(8.0, 1.0);
		setName("Winged Reaper");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}

	public Turkey(String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Turkey);
	}

}
