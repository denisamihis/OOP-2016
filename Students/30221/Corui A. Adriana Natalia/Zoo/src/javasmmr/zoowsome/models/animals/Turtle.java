package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Turtle extends Reptile{

	public Turtle(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setEgg(true);
		super.setName("turtle");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle);
	}
}
