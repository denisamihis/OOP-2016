package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Seaturtle extends Reptile {
	public Seaturtle() {
		super(3.0,0.0001);
		setNrOfLegs(2);
		setName("Seaturtle");
		setLaysEggs(true);
	}
	
	public Seaturtle(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean laysEggs) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Seaturtle);
	}
}
