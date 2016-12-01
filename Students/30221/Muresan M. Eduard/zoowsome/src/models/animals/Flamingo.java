package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Flamingo extends Bird{
	private String specie;
	public Flamingo()
	{
		super(true, 300, "Unknown", 2, 2.0, 0.1);
		specie = "Unknown";
	}
	public Flamingo(String name, String specie)
	{
		super(true, 300, name, 2, 2.0, 0.1);
		this.specie = specie;
	}
	//Flamingos kill when they feel like it
	public String getSpecie()
	{
		return specie;
	}
	public void setSpecie(String specie)
	{
		this.specie = specie;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"specie", String.valueOf(this.specie));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Flamingo);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setSpecie(element.getElementsByTagName("specie").item(0).getTextContent());
	}
}
