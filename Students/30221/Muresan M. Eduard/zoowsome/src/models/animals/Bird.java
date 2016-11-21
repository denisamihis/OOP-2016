package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal{
	protected boolean migrates;
	protected int avgFlightAltitude;
	public Bird(boolean migrates, int avgFlightAltitude, String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	public boolean getMigrates()
	{
		return migrates;
	}
	public void setMigrates(boolean migrates)
	{
		this.migrates = migrates;
	}
	public int getAvgFlightAltitude()
	{
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude)
	{
		this.avgFlightAltitude = avgFlightAltitude;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"migrates", String.valueOf(this.migrates));
		createNode(eventWriter,"avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}
	public void decodeFromXML( Element element) 
	{
		super.decodeFromXML(element);
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		setMigrates (Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
	}
}
