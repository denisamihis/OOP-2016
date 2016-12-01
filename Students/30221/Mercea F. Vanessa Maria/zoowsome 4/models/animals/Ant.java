package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Ant extends Insect {
	public Ant() {
		super(1.0,0.0001);
		setNrOfLegs(6);
		setName("Ant");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Ant(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean canFly, boolean isDangerous) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setTakenCareOf(false);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Ant);
	}
}
