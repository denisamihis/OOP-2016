package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class StagBeetle extends Insect{
	private int jawsLength;
	public StagBeetle()
	{
		super(true, false, "Unknown", 6, 0.5, 0.1);
		jawsLength = 0;
	}
	public StagBeetle(String name, int jawsLength)
	{
		super(true, false, name, 6, 0.5, 0.1);
		this.jawsLength = jawsLength;
	}
	// They don't realy care about time and date :)
	public int getJawsLength()
	{
		return jawsLength;
	}
	public void setJawsLength(int jawsLength)
	{
		this.jawsLength = jawsLength;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"jawsLength", String.valueOf(this.jawsLength));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.StagBeetle);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setJawsLength(Integer.valueOf(element.getElementsByTagName("jawsLength").item(0).getTextContent()));
	}
}
