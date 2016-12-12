package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Duck extends Bird{

	public Duck(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(2);
		super.setAvgFlyAltitude(20);
		super.setMigration(false);
		super.setName("duck");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Duck);
	}
}
