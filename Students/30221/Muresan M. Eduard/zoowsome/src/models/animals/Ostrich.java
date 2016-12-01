package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Ostrich extends Bird{
	private boolean headInSand;
	public Ostrich()
	{
		super(true, 0, "Unknown", 2, 2.0, 0.3);
		headInSand = false;
	}
	public Ostrich(String name, boolean headInSand)
	{
		super(true, 0, name, 2, 2.0, 0.3);
		this.headInSand = headInSand;
	}
	//if their head is buried in sand, they can't kill, can they?
	@Override
	public double getPredisposition()
	{
		if (headInSand == true)
			return -0.3;
		return 0;
	}
	public boolean getHeadInSand()
	{
		return headInSand;
	}
	public void setHeadInSand(boolean headInSand)
	{
		this.headInSand = headInSand;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"headInSand", String.valueOf(this.headInSand));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Ostrich);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setHeadInSand(Boolean.valueOf(element.getElementsByTagName("headInSand").item(0).getTextContent()));
	}
}
