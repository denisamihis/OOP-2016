package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.constants.Constants;

public class Lizard extends Reptile {

	public Lizard(Integer nrOfLegs, String name, boolean layEggs, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Lizard() {
		super(1.0, 0.04);
		setNrOfLegs(4);
		setName("Lizard");
		setLayEggs(true);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.LIZARD);
	}
	
}
