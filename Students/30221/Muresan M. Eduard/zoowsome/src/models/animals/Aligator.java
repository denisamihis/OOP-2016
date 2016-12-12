package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Aligator extends Reptile{
	private int length;
	public Aligator()
	{
		super(true, "Unknown", 4, 4.0, 0.8);
		this.length = 0;
	}
	public Aligator(String name, int length)
	{
		super(true, name, 4, 4.0, 0.8);
		this.length = length;
	}
	//These are dangerous at all times
	public int getLength()
	{
		return length;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"length", String.valueOf(this.length));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Aligator);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setLength(Integer.valueOf(element.getElementsByTagName("length").item(0).getTextContent()));
	}
}
