package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.*;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Kangaroo extends Mammal{
	public String specie;
	public Kangaroo()
	{
		super(36.8, 0.98, "Unknown", 2, 3.0, 0.1);
		specie = "Unknown";
	}
	public Kangaroo(String name, String specie)
	{
		super(36.8, 0.98, name, 2, 3.0, 0.1);
		this.specie = specie;
	}
	//Kangaroos hate waking up in the morning
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 5 && c.get(Calendar.HOUR_OF_DAY) < 9)
			return 0.5;
		return 0;
	}
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Kangaroo);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setSpecie(element.getElementsByTagName("specie").item(0).getTextContent());
	}
}
