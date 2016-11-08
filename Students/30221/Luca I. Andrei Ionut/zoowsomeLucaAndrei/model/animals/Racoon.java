package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class Racoon extends Mammal {
	public Racoon() {
		super(2.0, 0.00);
		setNrOfLegs(4);
		setName("Racoon");
		setPercBodyHair(70);
		setNormalBodyTemp(35);
	}

	public Racoon(Integer nrOfLegs, String name, Float percBodyHair, Float normalBodyTemp, Double maintenaceCost,
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Racoon);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
