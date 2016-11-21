package models.animals;

import static repositories.AnimalRepository.createNode;

import java.awt.Color;
import java.util.*;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Duck extends Bird{
	private Color color;
	public Duck()
	{
		super(true, 300, "Unknown", 2, 2.0, 0.1);
		color = null;
	}
	public Duck(String name, Color color)
	{
		super(true, 300, name, 2, 2.0, 0.1);
		this.color = color;
	}
	//Ducks apparently get a thirst for blood on Tuesdays
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY)
			return 0.5;
		return 0;
		
	}
	public Color getColor()
	{
		return color;
	}
	public void setColor(Color color)
	{
		this.color = color;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"color", String.valueOf(this.color));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Duck);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setColor(Color.getColor(element.getElementsByTagName("color").item(0).getTextContent()));
	}
}
