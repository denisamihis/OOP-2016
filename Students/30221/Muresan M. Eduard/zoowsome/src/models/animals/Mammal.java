package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal{
	protected float normalBodyTemp;
	protected float percBodyHair;
	public Mammal(double normalBodyTemp,double percBodyHair,String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.normalBodyTemp = (float)normalBodyTemp;
		this.percBodyHair = (float)percBodyHair;
	}
	public float getNormalBodyTemp()
	{
		return normalBodyTemp;
	}
	public void setNormalBodyTemp(double normalBodyTemp)
	{
		this.normalBodyTemp = (float)normalBodyTemp;
	}
	public float getPercBodyHair()
	{
		return percBodyHair;
	}
	public void setPercBodyHair(double percBodyHair)
	{
		this.percBodyHair = (float)percBodyHair;
	}
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException
	{
		super.encodeToXML(eventWriter);
		createNode(eventWriter,"normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter,"percBodyHair", String.valueOf(this.percBodyHair));
	}
	public void decodeFromXML( Element element) 
	{
		super.decodeFromXML(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair (Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
