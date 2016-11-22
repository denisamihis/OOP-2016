package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Mosquito extends Insect {
	public Mosquito() {
		super(3.0,0.0002);
		setNrOfLegs(6);
		setName("Mosquito");
		setCanFly(true);
		setIsDangerous(true);
	}
	
	public Mosquito(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean canFly, boolean isDangerous) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Mosquito);
	}
}
