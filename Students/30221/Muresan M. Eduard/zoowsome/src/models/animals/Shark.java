package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Shark extends Aquatic{
	private float biteWidth;
	public Shark()
	{
		super(80, water.saltWater, "Unknown", 0, 3.0, 0.8);
		biteWidth = 0;
	}
	public Shark(String name, double biteWidth)
	{
		super(30, water.saltWater, name, 0, 3.0, 0.8);
		this.biteWidth = (float)biteWidth;
	}
	//Sharks are dangerous at all times, they get lethal however between 12 and 16
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 12 && c.get(Calendar.HOUR_OF_DAY) < 16)
			return 0.2;
		return 0;
	}
	public float getBiteWidth()
	{
		return biteWidth;
	}
	public void setBiteWidth(double biteWidth)
	{
		this.biteWidth = (float)biteWidth;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"biteWidth", String.valueOf(this.biteWidth));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setBiteWidth(Float.valueOf(element.getElementsByTagName("biteWidth").item(0).getTextContent()));
	}
}
