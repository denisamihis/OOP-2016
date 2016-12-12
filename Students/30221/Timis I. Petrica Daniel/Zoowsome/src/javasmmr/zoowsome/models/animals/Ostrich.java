package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.constants.Constants;

public class Ostrich extends Bird {

	public Ostrich(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Ostrich() {
		super(2.7, 0.07);
		setNrOfLegs(2);
		setName("Ostrich");
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.OSTRICH);
	}
	
}
