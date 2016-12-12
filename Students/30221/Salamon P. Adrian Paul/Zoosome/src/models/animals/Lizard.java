package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Lizard extends Reptile {
	public Lizard() {
		super(4.0,0.6);
		setName("Lizirdom");
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public Lizard(String name,Double maintenanceCost, double percKill) {
		super(maintenanceCost,percKill);
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(true);
	

	}
	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{super.encodedToXml(eventWriter);
	createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,
			Constants.Animals.Reptiles.Lizard);}

}
