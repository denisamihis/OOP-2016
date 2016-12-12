package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class PolarBear extends Mammal {
	public PolarBear() {
		super(3.0, 0.003);
		setNrOfLegs(4);
		setName("PolarBear");
		setPercBodyHair(90);
		setNormalBodyTemp(40);
	}

	public PolarBear(Integer nrOfLegs, String name, Float percBodyHair, Float normalBodyTemp, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setPercBodyHair(percBodyHair);
		setNormalBodyTemp(normalBodyTemp);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.PolarBear);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
