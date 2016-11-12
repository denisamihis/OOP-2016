package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Woodpecker extends Bird {
	public Woodpecker() {
		super(1.0,0.0001);
		setNrOfLegs(2);
		setName("Woodpecker");
		setMigrates(true);
		setAvgFlightAltitude(50);
	}
	
	public Woodpecker(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avgFlightAltitude) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Woodpecker);
	}
}
