package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Gopher extends Mammal{
	private String shape;
	public Gopher()
	{
		super(37, 0.99, "Unknown", 4, 1.15, 0.1);
		shape = "Gopher shape";
	}
	public Gopher(String name)
	{
		super(37, 0.99, name, 4, 1.15, 0.1);
		shape = "Gopher shape";
	}
	//Gophers get drunk Friday nights so they get aggressive
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 18 && c.get(Calendar.HOUR_OF_DAY) < 23 && c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
			return 0.3;
		return 0;
	}
	public String getShape()
	{
		return shape;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"shape", String.valueOf(this.shape));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Gopher);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setShape(element.getElementsByTagName("shape").item(0).getTextContent());
	}
}
