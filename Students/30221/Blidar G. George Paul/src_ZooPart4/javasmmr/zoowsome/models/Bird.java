package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;


public abstract class Bird extends Animal {
	
	private boolean migrates;
	private int avgFlightAltitude;
	
	public Bird(Double theValue, double dangerPerc) // added this one
	{
		super(theValue,dangerPerc);
	}
	
	public boolean isMigrating()
	{
		return migrates;
	}
	
	public void setIsMigrating(boolean answer)
	{
		migrates = answer;
	}
	
	public int getAvgFlightAltitude()
	{
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(int value)
	{
		avgFlightAltitude = value;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}
	
	public void decodeFromXml(Element element)
	{
		setIsMigrating(Boolean.valueOf(element.getElementsByTagName("mirates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
