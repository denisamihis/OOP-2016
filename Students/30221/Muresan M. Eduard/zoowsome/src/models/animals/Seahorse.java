package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Seahorse extends Aquatic{
	public String specie;
	public Seahorse()
	{
		super(20, water.saltWater, "Unknown", 1, 1.0, 0.1);
		specie = "Unknown";
	}
	public Seahorse(String name, String specie)
	{
		super(20, water.saltWater, name, 1, 1.0, 0.1);
		this.specie = specie;
	}
	//these are a bit lethal at all times :)
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Seahorse);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setSpecie(element.getElementsByTagName("specie").item(0).getTextContent());
	}
}
