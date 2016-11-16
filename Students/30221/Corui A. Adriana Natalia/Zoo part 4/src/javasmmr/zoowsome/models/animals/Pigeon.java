package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Pigeon extends Bird{

	public Pigeon(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(6);
		super.setAvgFlyAltitude(5);
		super.setMigration(false);
		super.setName("pigeon");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Pigeon);
	}
}
