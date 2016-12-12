package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class StingBee extends Insect {
	public StingBee() {
		super(1.0, 0.001);
		setNrOfLegs(6);
		setName("StingBee");
		setIsDangerous(true);
		setCanFly(true);
	}

	public StingBee(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.StingBee);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}
}