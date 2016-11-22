package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import factories.Constants;

public class Hyena extends Mammal {
	public Hyena() {
		super(3.0,0.0001);
		setNrOfLegs(4);
		setName("Hyena");
		setNormalBodyTemp(38);
		setPercBodyHair(80);
		}
	
	public Hyena(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer normalBodyTemp, Integer percBodyHair) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Hyena);
	}
}
