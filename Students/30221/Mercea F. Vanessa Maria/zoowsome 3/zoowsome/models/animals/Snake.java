package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Snake extends Reptile {
	public Snake() {
		super(2.0,0.002);
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(false);
	}
	
	public Snake(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean laysEggs) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Snake);
	}
}
