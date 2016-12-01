package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Stingray extends Aquatic{
	private int stingerLength;
	public Stingray()
	{
		super(80, water.saltWater, "Unknown", 0, 3.0, 0.6);
		stingerLength = 0;
	}
	public Stingray(String name, int stingerLength)
	{
		super(80, water.saltWater, name, 0, 3.0, 0.6);
		this.stingerLength = stingerLength;
	}
	//true killers
	public int getStingerLength()
	{
		return stingerLength;
	}
	public void setStingerLength(int stingerLength)
	{
		this.stingerLength = stingerLength;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"stingerLength", String.valueOf(this.stingerLength));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Stingray);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setStingerLength(Integer.valueOf(element.getElementsByTagName("stingerLength").item(0).getTextContent()));
	}
}
