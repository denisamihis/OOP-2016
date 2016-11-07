package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Stork extends Bird {
	public Stork() {
		super(2.0,0.0001);
		setNrOfLegs(2);
		setName("Stork");
		setMigrates(true);
		setAvgFlightAltitude(50);
	}
	
	public Stork(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avgFlightAltitude) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Stork);
	}
}
