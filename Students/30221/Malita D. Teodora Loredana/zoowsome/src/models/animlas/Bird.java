package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;

public abstract class Bird extends Animal {
	protected boolean migrates;
	protected float altitude;
	public Bird(boolean migrates,float altitude , String name, int nrOfLegs,double maintenanceCost,double dangPerc){
		super(name,nrOfLegs, maintenanceCost, dangPerc);
		this.migrates = migrates;
		this.altitude = altitude;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,"migrates",String.valueOf(getIfMigrates()));
		AnimalRepository.createNode(eventWriter, "altitude", String.valueOf(getAltitude()));
	}
	public void decodeFromXml(Element element){
		setIfMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAltitude(Float.valueOf(element.getElementsByTagName("altitude").item(0).getTextContent()));
	}

	public boolean getIfMigrates()
	{
		return migrates;
	}
	public void setIfMigrates(boolean migrates)
	{
		this.migrates=migrates;
	}
	public float getAltitude()
	{
		return altitude;
	}
	public void setAltitude(float altitude)
	{
		this.altitude=altitude;
	}

}
