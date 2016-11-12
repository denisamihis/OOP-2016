package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Cow  extends Mammal{

	public Cow(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setBodyTemp(30);
		super.setPrecBodyHair(98);
		super.setName("cow");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
	}
}
