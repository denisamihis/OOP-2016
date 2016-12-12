package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class BlackMamba extends Reptile {
	public BlackMamba() {
		super(3.0, 0.05);
		setNrOfLegs(0);
		setName("BlackMamba");
		setLaysEggs(true);
	}

	public BlackMamba(Integer nrOfLegs, String name, Boolean laysEggs, Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);

	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.BlackMamba);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}