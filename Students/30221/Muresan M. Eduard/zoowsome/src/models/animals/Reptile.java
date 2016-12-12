package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal{
	protected boolean laysEggs;
	public Reptile(boolean laysEggs, String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
	public boolean getLaysEggs()
	{
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs)
	{
		this.laysEggs = laysEggs;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"laysEggs", String.valueOf(this.laysEggs));
	}
	public void decodeFromXML( Element element) 
	{
		super.decodeFromXML(element);
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
