package javasmmr.zoowsome.models.animals;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Shark extends Aquatic{

	public Shark(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(50);
		super.setWaterType(WaterType.saltwater);
		super.setName("shark");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
}
