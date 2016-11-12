package animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
import static repositories.AnimalRepository.createNode;
import factories.Constants;

public class Beetle extends Insect {
	public Beetle() {
		super(1.0, 0.00);
		setNrOfLegs(6);
		setName("Beetle");
		setCanFly(true);
		setIsDangerous(false);

	}

	public Beetle(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenaceCost,
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Beetle);
	}

}
