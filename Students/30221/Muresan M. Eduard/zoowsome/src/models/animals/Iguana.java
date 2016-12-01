package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Iguana extends Reptile{
	
	public Iguana()
	{
		super(true, "Unknown", 4, 2.0, 0.1);
	}
	public Iguana(String name)
	{
		super(true, name, 4, 2.0, 0.1);
	}
	//Iguanas are hung over Saturdays so they don't like being bothered Saturday mornings
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 5 && c.get(Calendar.HOUR_OF_DAY) < 10 && c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
			return 0.9;
		return 0;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Iguana);
	}
}
