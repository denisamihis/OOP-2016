package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class KomodoDragon extends Reptile{
	
	public KomodoDragon()
	{
		super (true, "Unknown", 4, 4.0, 0.7);
	}
	public KomodoDragon(String name)
	{
		super(true, name, 4, 4.0, 0.7);
	}
	//These are dangerous at all times
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.KomodoDragon);
	}
}
