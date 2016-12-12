package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Owl extends Bird{

	public Owl(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(2);
		super.setAvgFlyAltitude(10);
		super.setMigration(true);
		super.setName("owl");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
	}
}
