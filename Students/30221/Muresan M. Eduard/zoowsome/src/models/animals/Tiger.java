package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.Constants;

public class Tiger extends Mammal{
	private String specie;
	public Tiger()
	{
		super(37.5, 0.98, "Unknown", 4, 4.0, 0.9);
		specie = "Unknown";
	}
	public Tiger(String name,String specie)
	{
		super(37.5, 0.98, name, 4, 4.0, 0.9);
		this.specie = specie;
	}
	//Tigers are kind of lazy in the mornings, evenings and at night :)
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 20 && c.get(Calendar.HOUR_OF_DAY) < 10)
			return -0.9;
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
	public void decodeFromXML(Element element) 
	{
		super.decodeFromXML(element);
		setSpecie(element.getElementsByTagName("specie").item(0).getTextContent());
	}
}
