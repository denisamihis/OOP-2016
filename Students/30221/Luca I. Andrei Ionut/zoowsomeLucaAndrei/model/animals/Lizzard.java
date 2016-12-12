package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class Lizzard extends Reptile {
	public Lizzard() {
		super(1.0, 0.00);
		setNrOfLegs(4);
		setName("Lizard");
		setLaysEggs(true);
	}

	public Lizzard(Integer nrOfLegs, String name, Boolean laysEggs, Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);

	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Lizzard);
	}


	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
