package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;

public class Jellyfish extends Aquatic{

	public Jellyfish(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(0);
		super.setAvgSwimDepth(5);
		super.setWaterType(WaterType.freshwater);
		super.setName("jellyfish");	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Jellyfish);
	}
}
