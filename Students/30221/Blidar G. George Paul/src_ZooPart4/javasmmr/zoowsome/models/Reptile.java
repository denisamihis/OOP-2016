package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Reptile extends Animal {
	
	private boolean laysEggs;
	
	public Reptile(Double theValue, double dangerPerc)
	{
		super(theValue, dangerPerc);
	}
	
	public boolean isLayingEggs()
	{
		return laysEggs;
	}
	
	public void setLayingEggs(boolean answer)
	{
		laysEggs = answer;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}
	
	public void decodeFromXml(Element element)
	{
		setLayingEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
	
}